package P1;

public class RetrunProgram1 {
	
	public static boolean Exam()
	{
		return true;
	}
	
	public static boolean Exam1()
	{
		
		return false;
	}
	public void result()
	{
		boolean status = Exam();
		System.out.println(status);
	}
	public static void result1()
	{
		
		boolean st = Exam1();
		System.out.println(st);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RetrunProgram1 obj = new RetrunProgram1();
		obj.result();
		//result();
		result1();
	}

}
