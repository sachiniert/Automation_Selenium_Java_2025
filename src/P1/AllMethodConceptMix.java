package P1;

public class AllMethodConceptMix {
	public static void Add()
	{
	  int a = 5; 
	  int b = 6;
	  int c =  9;
	  int d = a+b+c;
	  System.out.println(d);
		
	}
	public void Mul()
	{
		  int a = 5; 
		  int b = 6;
		  int c =  9;
		  int e = a*b*c;
		  System.out.println(e);
		
	}
	public static void fullname(String firstename, String lastname) 
	{
		System.out.println("Sachin Yadav ");
		
		
	}
	
	public void Login(String usernmae,String password, int otp )
	{
		
		System.out.println("Login sussecfull");
		System.out.println(usernmae); // see what username send in parameter 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Add();
		
		AllMethodConceptMix obj = new AllMethodConceptMix();
		
	    obj.Mul();
	    fullname("sachin","yadav");
	    obj.Login("sachin@gmail.com", "23jfjj", 10);
		

	}

}
