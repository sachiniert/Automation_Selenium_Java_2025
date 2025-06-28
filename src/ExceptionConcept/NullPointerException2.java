package ExceptionConcept;

public class NullPointerException2 {

	
		public static void login()
		{
			System.out.println("login code");
		}
		static String data;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				
					//data= "selenium";
					data=null;
					System.out.println(data.length());
				}
			catch(NullPointerException e)
			{
				System.out.println(e);
				data="Testing";
				System.out.println(data.length());
			}
			login();

	}

}
