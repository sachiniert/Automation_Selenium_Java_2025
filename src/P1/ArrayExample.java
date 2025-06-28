package P1;

public class ArrayExample {

	public static void main(String[] args) {
		// how to create an array
		// datatype[]  variable={"values"};
		
		int[] rollnumber= {10,2,3,4,45,6,0,7,8};
		System.out.println(rollnumber[5]);
		System.out.println(rollnumber.length);
		System.out.println(rollnumber.length-2);
		System.out.println(rollnumber);// print garbage value
		
		for(int i=0; i<=rollnumber.length-1;i++)
		{
			System.out.println(rollnumber[i]);
			
			
		}

	}

}

//imporatant question for everyone
// print array in ascending to descending with out duplicate
// 3 4 10 12 13 22 311
// 3,10
//311 22 13 10 12 4 3
