package SeleniumProgramByMaheshSir;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDataConDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrom.driver", "C:\\Users\\sy945\\DriverJuly2025\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver	 driver= new ChromeDriver();
	     driver.get("https://testingmasters.weebly.com/webtables.html");
	 List<String> expectedAnlayst= new ArrayList<String>();

	 expectedAnlayst.add("S148106");
	 expectedAnlayst.add("S148107");
	 expectedAnlayst.add("S148109");
	 expectedAnlayst.add("S148111");

	List<WebElement>allheaders=driver.findElements(By.xpath("//table[@id='VisitingTable']//tbody/tr/td[4][starts-with(text(),'demo')]/preceding-sibling::td[2]"));

	List<String> actualAnalyst= new ArrayList<String>();
	for(int i=0;i<=allheaders.size()-1;i++)
	{

		actualAnalyst.add(allheaders.get(i).getText());
	}
	System.out.println(expectedAnlayst.containsAll(actualAnalyst));

	}

}
