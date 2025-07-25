package ImportantInterviewQuestion;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String original = "Sachin";
	        String reversed = "";
	        for (int i = original.length() - 1; i >= 0; i--) {
	            reversed += original.charAt(i);
	        }
	        System.out.println("Reversed String: " + reversed);

	}

}
