package StringConcept;

public class Exapmle6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String filename="D://myfiles//my document//myddkndjandkhbUGSDVSKJGCHata.xsl";
		 //o/p as filename

System.out.println(filename.substring(filename.lastIndexOf("//")+2,filename.lastIndexOf('.')));



String extension=filename.substring(filename.lastIndexOf(".")+1);

System.out.println(extension);

if(extension.equals("xslx"))
{
	System.out.println("xslx code is executed");
	
}
else
{
	System.out.println("xsl code is executed");
}

	}

}
