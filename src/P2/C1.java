package P2;

public class C1 {
	public static int x=10;
	/* here we can change public to (private,protected and default) and check where is erroe comes or not this is acces modifires rule
	 ex1:- private void login()
	 ex2:- protected void login()
	 ex3:- void login ()
	 */
	
	public static void login()
	{
		System.out.println("Selenium code of C1");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       login();
	}

}
