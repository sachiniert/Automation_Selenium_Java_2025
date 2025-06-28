package StringConcept;

public class Example1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		//String immumable--cant change
		 
		 String name="Testing is important and testing best";
		 //it will retunr the char value of given index
	//System.out.println(	 name.charAt(500));//StringIndexOutOfBoundsException
	System.out.println(	 name.charAt(0));//T
	System.out.println(name.charAt(name.length()-1));//t
	
	
	for(int i=0;i<=name.length()-1;i++) 
	  {
		System.out.println(	 name.charAt(i));//
	
	  }
	}
}
