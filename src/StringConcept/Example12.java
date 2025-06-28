package StringConcept;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char data='a';
		int value=data;
	//	System.out.println(value);
		
		if((value>=65) && (value<=90))
		{
			value=value+32;
		
			char updatedata=(char) value;
			
			System.out.println(updatedata);
			
		}
		else
		{
			value=value-32;
			
			char updatedata=(char) value;
			
			System.out.println(updatedata);
		}

	}

}
