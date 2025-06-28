package P2;

public class MultilevelInheritance extends SingleInhertiance11 {
	MultilevelInheritance()
	{
		System.out.println("MultilevelInheritance");
	}
	
	public static void delete()
	{
		System.out.println("Delete");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultilevelInheritance obj = new MultilevelInheritance();
		login();
		cancel();
		delete();

	}

}
