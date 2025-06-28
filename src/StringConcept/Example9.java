package StringConcept;

public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename="Testing is best and Testing is good";
		String[] values=	 filename.split(" ");
		                     //{"Testing","is,"best","and","Testing.};
		
		for(String data:values)
		{
			System.out.println(data);
		}

	}

}
