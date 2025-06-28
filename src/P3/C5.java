package P3;
import OverRidingConcept.Overriding1;
//import package.class;

public class C5  extends Overriding1{
	
	public void login()
	{
		System.out.println("login code of c5");
		System.out.println("code got increased as we got new step added");
	}

	public void remove()
	{
		System.out.println("remove code of c5");
		System.out.println("code got increased as we got new step added");
	}

	public static void main(String[] args) {
		C5 obj = new C5();
		obj.login();// child clas login bcz we create object for child class and reference of child class
		obj.cancel();
		obj.remove();
		
	//	Overriding1 obj2 = new Overriding1();
	//	obj.login();
		
		Overriding1 obj3 = new C5();
		// paranet obj = new child();
		
		obj3.login();// child class login bcz we create object for child class and reference of paraent class..here we are doing over riding and upcasting
		obj3.cancel();
		//obj3.remove();
		

		
	}

}
