package test2;

public class Employee {
	
	public static final int level = 0;
	CallHandler callHandler;
    int rank; 
    boolean free;
    Employee(int rank) { this.rank = rank; }
    void ReceiveCall(Call call) {  }
    void CallHandled(Call call , String message) { call.reply(message);
    call.disconnect();
    callHandler.getNextCall(this);
   }
    void CannotHandle(Call call) { 
        call.rank = rank + 1;
        callHandler.dispatchCall(call);
        free = true;
        callHandler.getNextCall(this); 
    }

}
class Fresher extends Employee{
	 public Fresher() {super(0);}
	}
	class TechLead extends Employee{
	 public TechLead() {super(1);}
	}
	class ProductManager extends Employee{
	 public ProductManager() {super(2);}
	}
