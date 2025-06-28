package P1;

public class RetrunMethod2 {
	public static long outcomevalue; // i want store vlue outcome of Addition()..so that i can use any time
	
	public static void Add()
	{
		int x =100;
		int y = 40;
		int c = x+y;
		System.out.println(c);
	}
	
	public static long Addition()
	{
		int a =100;
		int b = 600;
		 int k = a+b;
		 return k;
		 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add();
		outcomevalue = Addition();
		System.out.println("We store value of Addition in outcomeValue:"+" "+outcomevalue);
		System.out.println(Addition());
	}

}
