package P1;

public class ArrayExam2 {
	
	public static int add()
	{
		int a=10;
		int b=30;
		return a+b;
	}

	public static void main(String[] args) {
		// 2nd way to declare array
		// datatype[] variable = datatype[size];
		int[] rollnumber = new int[9];
		rollnumber[0] = 10;
		rollnumber[1] = 3;
		rollnumber[2] = add();
		System.out.println(rollnumber[3]);//0
		System.out.println(rollnumber.length);//9
		System.out.println(rollnumber[rollnumber.length-2]);//0
		System.out.println(rollnumber);//address
		
		for(int i=0; i<=rollnumber.length-1;i++)
		{
			System.out.println(rollnumber[i]);
	        add();
		}
		
	}

}
