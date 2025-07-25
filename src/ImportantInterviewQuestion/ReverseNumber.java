package ImportantInterviewQuestion;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number = 12345;
	        int reverse = 0;
	        while (number != 0) {
	            int digit = number % 10;       // get last digit
	            reverse = reverse * 10 + digit;
	            number = number / 10;          // remove last digit
	        }

	        System.out.println("Reversed Number: " + reverse);

	}

}
