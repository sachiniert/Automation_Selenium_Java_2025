package ExceptionConcept;

public class NumberformatException3 {

	public static void login()
	{
		System.out.println("login code");
	}
	static String data;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
				
				data="abc";
				int mydata =  Integer.valueOf(data);
				//System.out.println(data.length());
			}
		catch(NumberFormatException e)
		{
			System.out.println(e);
			data="233";
			int mydata= Integer.valueOf(data);
			//System.out.println(data.length());
		}
		login();

	}

}
