package StringConcept;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String filename="Testing masters";
			char[] values= filename.toCharArray();// will return the char array--
			//char[] values={'T','e','s','t','i'.....};
			
//			for( int i=0;i<values.length;i++)
//			{
//				System.out.println(values[i]);
//			}
			
			for( char data:values)
			{
				System.out.println(data);
			}


	}

}
