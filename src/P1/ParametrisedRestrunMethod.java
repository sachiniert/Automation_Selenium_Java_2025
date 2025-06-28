package P1;

public class ParametrisedRestrunMethod {

	public static char gen(char gender)
	{
		return gender;
		
	}

	public static void main(String[] args) {     
		char value = gen('M');
		System.out.println(value);
	}

}
