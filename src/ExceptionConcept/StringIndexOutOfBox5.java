package ExceptionConcept;

public class StringIndexOutOfBox5 {

	public static void login()
	{
		System.out.println("login code");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try
		 {
	          String	data[]= {"Ravi","Paveen"};
	          
	          System.out.println(data[20]);	          
	          	
		 }
		 catch(StringIndexOutOfBoundsException  e)
		 {
			 System.out.println(e);
			   String	data[]= {"Ravi","Paveen"};
		          
		          System.out.println(data[0]);
		 }
finally
{
	System.out.println("finall code");
}
		 
	 login();
		
	}

}
