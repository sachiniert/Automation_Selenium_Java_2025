package P1;

public class ArrayExam3 {
	public static int add()
	{
		int a=10;
		int b=30;
		return a+b;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2nd way to declare array
		// datatype[] variable = datatype[size];
		int[] rollnumber = new int[9];
		rollnumber[0] = 10;
		rollnumber[1] = 3;
		rollnumber[2] = add();
		
		for(int value: rollnumber)
		{
			System.out.println(value);
		}
	}

}
