package P1;

public class ExceptionAgeTC01 extends ExceptionAgeExam6 {
	
	ExceptionAgeTC01()
	{
		super();
		
	}
	public void login()
	{
		System.out.println("login code of child");
	}
	public void cancel()
	{
		super.login();
	}
	
	//what is super and this key word 
	// this refers to child /current class
	//this keyword ..can call current class constructor// method//variables
	//this cant use in static methods
	
	public static void main(String[] args)
	{
		ExceptionAgeTC01 obj = new ExceptionAgeTC01();
		obj.cancel();

	}

}
