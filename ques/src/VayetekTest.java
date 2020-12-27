
public class VayetekTest {
	public static void main(String[] args) {
		String s1 , s2 ;
		VayetekTest so = new VayetekTest();
	System.out.println("saisir s1  :");
	s1  = Clavier.lireString();
	System.out.println("saisir s2  :");
	s2 = Clavier.lireString();
	
	System.out.println(so.isRotation(s1, s2));
}

public boolean isRotation(String s1,String s2){
	if(s1==null||s2==null||s1.length()!=s2.length())
		return false;
	if(s1.equals("")&&s2.equals(""))
		return true;
	String fulls1=s1+s1;
	return isSubstring(fulls1,s2);
}

private boolean isSubstring(String fulls1, String s2) {
	// TODO Auto-generated method stub
	int len=s2.length();
	for(int i=0;i<len;i++){
		
		if(fulls1.subSequence(i, i+len).equals(s2))
			return true;			
	}
	return false;
}

}
