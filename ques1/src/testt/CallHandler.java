package test2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CallHandler {
    static final int LEVELS = 3; 
    static  int NUM_FRESHERS = 5; 
    ArrayList<Employee>[] employeeLevels = new ArrayList[LEVELS];
    
    Queue<Call>[] callQueues = new LinkedList[LEVELS];

    public CallHandler(int NUM_FRESHERS) { 
    this.NUM_FRESHERS = NUM_FRESHERS;
    employeeLevels = new ArrayList[LEVELS];
    callQueues = new LinkedList[LEVELS];}

    Employee getCallHandler(Call call) {
        for (int level = call.rank ; level < LEVELS - 1; level++) {
            ArrayList<Employee> employeeLevel = employeeLevels[level];
            for (Employee emp : employeeLevel) {
                if (emp.free) {
                    return emp;
                }
            }
        }
        return null;
    }
    void dispatchCall(Call call) {
       
        Employee emp = getCallHandler(call);
        if (emp != null) {
            emp.ReceiveCall(call);
        } else {
            callQueues[call.rank].add(call);
        }
    }
    void getNextCall(Employee e) { 
    	 if(callQueues[e.level].size() != 0){
    		   Call next = callQueues[e.level].poll();
    		   e.ReceiveCall(next);
    		  }
    } 
}