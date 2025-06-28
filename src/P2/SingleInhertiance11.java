package P2;

public class SingleInhertiance11 extends SingleInhertiance1 {
	
	SingleInhertiance11()
	{
		
		System.out.println("constructor of SingleInhertiance11");
	}
	public static void cancel()
	{
		
		System.out.println("Cancel code");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInhertiance11 obj = new SingleInhertiance11();
		login();
		cancel();

	}

}
