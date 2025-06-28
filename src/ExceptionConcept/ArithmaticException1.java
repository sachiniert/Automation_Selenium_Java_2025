package ExceptionConcept;

public class ArithmaticException1 {


		public static void login()
		{
			System.out.println("login code");
		}
		
		static int data;
		
		

		public static void main(String[] args) {
			// 
			try
			{
				data=100/50; //occur exception-java.lang.ArtihmeticException:/by zero
				System.out.println(data);
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
				data=100/10;
				System.out.println(data);
			}
			
			login();


	}

}
