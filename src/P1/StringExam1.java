package P1;

public class StringExam1 {

	public static void main(String[] args) {
		// String immutable -- cant cahnge
		
		String name = "Sachin";
	    name = name.concat(" Tendulakar");
	    String name1="Testing is important and testing best";
	    System.out.println(name);
	    System.out.println( name1.charAt(0));//T
	    System.out.println(name1.charAt(name1.length()-1));//t
	    
	    for(int i=0;i<=name1.length()-1;i++)
	    {
	    	System.out.println(name1.charAt(i));
	    	System.out.println(name1.length());
	    }
	    		

	}

}
