package P1;

public class MethodsConcept {
	
	public static void Add()
	{
		
		//selenium code
		int a = 10;
		int b = 100;
		int c= a+b;
		System.out.println(c);
	}
      public void sub()
     {
	int a=10;
	int b=100;
	int c = a+b;
	System.out.println(c);
	
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Add();// static method call directly without create  object
		MethodsConcept obj = new MethodsConcept();
		obj.sub();
		
	}

}
