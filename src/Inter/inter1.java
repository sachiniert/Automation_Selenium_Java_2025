package Inter;

public interface inter1 {
	
	/*inter1()
	{
		//we cant create constructor
	}*/
	
	public void login();
	
	public static void cancel()
	{
		System.out.println("cancel method of inter1");
		
	}
	public static void main(String[] a)
	{
		// inter1 obj = new inter1();
		// we cant create obj here --bcs memory will created in interface
		
	}

}
