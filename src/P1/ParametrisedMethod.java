package P1;

public class ParametrisedMethod {
	
	public static void Add(int x, int y)
	{
		
		int c = x+y;
		int z= x*y;
		System.out.println(c);
		
		System.out.println(z);
		//System.out.println(x); see x value
	}
	public static void login(String username, String password, int otp)
	{
		System.out.println("login code");
		System.out.println(otp); // what otp number send via parameter 
		
	}
	
	public void div(int x, int y)
	{
		
		int c=x/y;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Add(100,600);
		Add(4,6);
		ParametrisedMethod obj = new ParametrisedMethod();
		obj.div(50,2);
		login("Mahesh@gmail.com","p23244",440);
		

	}

}
