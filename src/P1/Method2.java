package P1;

public class Method2 {
	
	public static void Add()
	{
		
		int x=10;
		int y=30;
		int c=x+y;
		System.out.println(c);
	}
	
	public void mul()
	{
		int x= 50;
		int y=60;
		int z= x*y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add(); // Static method call directly in static method no need to create obj
		Method2 obj = new Method2(); // Non static method that reason create obj
		obj.mul();
		System.out.println("Checking only for github ");

	}

}
