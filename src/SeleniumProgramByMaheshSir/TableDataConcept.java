package SeleniumProgramByMaheshSir;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDataConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://testingmasters.weebly.com/webtables.html");
		 List<String> expectedAnlayst= new ArrayList<String>();

		 expectedAnlayst.add("S148101");
		 expectedAnlayst.add("S148102");
		 expectedAnlayst.add("S148105");
		 expectedAnlayst.add("S148107");
		 expectedAnlayst.add("S148109");
		 expectedAnlayst.add("S148110");
		 expectedAnlayst.add("S148111");
		 	
		List<WebElement>allheaders=driver.findElements(By.xpath("//table[@id='VisitingTable']//tbody//tr//td[5][text()='Analyst']//preceding-sibling::td[3]"));

		List<String> actualAnalyst= new ArrayList<String>();
		for(int i=0;i<=allheaders.size()-1;i++)
		{

			actualAnalyst.add(allheaders.get(i).getText());
		}
		System.out.println(expectedAnlayst.containsAll(actualAnalyst));

	}

}
