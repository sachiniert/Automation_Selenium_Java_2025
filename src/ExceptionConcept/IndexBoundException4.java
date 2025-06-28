package ExceptionConcept;

public class IndexBoundException4 {

	public static void login()
	{
		System.out.println("login code");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try
		 {
	          int	data[]= {1,4,50,3,2};
	          System.out.println(data[20]);
	          
	          	
		 }
		 catch(IndexOutOfBoundsException  e)
		 {
			 System.out.println(e);
		     int	data[]= {1,4,50,3,2};
	          System.out.println(data[2]);
		 }

	 login();
	}

}
