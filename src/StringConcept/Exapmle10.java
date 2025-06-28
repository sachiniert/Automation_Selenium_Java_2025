package StringConcept;

public class Exapmle10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String filename="here Testing is best and Testing is good Testing is  testing and where u are";
			String[] values=	 filename.split(" Testing ",4);
			                     //{"Testing","is,"best","and","Testing.};
			
			for(String data:values)
			{
				System.out.println(data);
			}

	}

}
