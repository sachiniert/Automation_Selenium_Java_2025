package P1;

public class FinalKeywordExam1 {
	 static int x=100;
	
	FinalKeywordExam1()
	{
		System.out.println("Default construtor");
	}
	public final void login()
	{
		System.out.println("login code of parent");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x=200;

	}

}
