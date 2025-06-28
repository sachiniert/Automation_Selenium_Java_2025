package P2;

public class HiracheyInheritance extends SingleInhertiance1 {
	
	HiracheyInheritance()
	{
		
		System.out.println("HiracheyInheritance");
	}
	public static void delete()
	{
		System.out.println("delete");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HiracheyInheritance obj = new HiracheyInheritance();
		login();
		//cancel();
		delete();
	}

}
