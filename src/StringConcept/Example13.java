package StringConcept;

public class Example13 {


		 public static void main(String args[])
		 {  
//ValueOf--converting one datatype to anotherdatatype
			 
			 int a=10;
			 
			 //to convert int to String
		String updatedone=	 String.valueOf(a);
	System.out.println(	updatedone+90);
	
	//String to int
	String age="34";
	int updtedage=Integer.valueOf(age);
	System.out.println(	updtedage+90);
	

	}

}
