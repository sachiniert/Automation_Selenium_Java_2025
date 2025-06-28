package P1;

public class SubStringExam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filename="D://myfiles//my document//myddkndjankshjdhhsh.xsl";
		// o/p filename
		
		System.out.println(filename.substring(filename.lastIndexOf("//")+2,filename.lastIndexOf('.')));
		
		
		String extension = filename.substring(filename.lastIndexOf(".")+1);
		System.out.println(extension);
		
		
		if(filename.equals("xslx"))
				{
					System.out.println("xslx code is executed");
					
				}
		else
		{
			System.out.println("xls code is executed");
		}
	}

}
