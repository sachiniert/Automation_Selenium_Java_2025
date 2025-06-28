package SeleniumProgramByMaheshSir;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHeaderConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver	 driver= new ChromeDriver();
	     driver.get("https://testingmasters.weebly.com/webtables.html");
	 List<String> expectedheaders= new ArrayList<String>();
	 expectedheaders.add("");
	 expectedheaders.add("Employee ID");
	 expectedheaders.add("UserName");
	 expectedheaders.add("Mail Id");
	 expectedheaders.add("Designation");
	 expectedheaders.add("Phone Number");
	 expectedheaders.add("Days");
	 expectedheaders.add("Status");
	 	
	List<WebElement>allheaders=driver.findElements(By.xpath("//table[@id='VisitingTable']//thead/tr/th"));
	List<String> Actualheaders= new ArrayList<String>();
	for(int i=0;i<=allheaders.size()-1;i++)
	{

		Actualheaders.add(allheaders.get(i).getText());
	}
	System.out.println(expectedheaders.containsAll(Actualheaders));

	}

}
