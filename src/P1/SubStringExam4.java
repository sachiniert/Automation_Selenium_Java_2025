package P1;

public class SubStringExam4 {

	public static void main(String[] args) {
		String name="and is Testing is important and testing best";
		System.out.println(name.substring(10));// it will part of string from the given index
		System.out.println(name.substring(10,29));//it will part string from the gievn index
		
		System.out.println(name.substring(10,25));//StringIndexOutOfBoundsException

	}

}
