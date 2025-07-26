package SeleniumProgramByMaheshSir;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownLinkConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrom.driver", "C:\\Users\\sy945\\DriverJuly2025\\chromedriver-win64\\chromedriver-win64.exe");	
		WebDriver	 driver= new ChromeDriver();
	     driver.get("https://demo.guru99.com/test/newtours/register.php");
	     Thread.sleep(5000);
Select dropdowncountry= new Select(driver.findElement(By.xpath("//select[@name='country']")));
List<WebElement>allvalues=dropdowncountry.getOptions();//it will return list of values;
dropdowncountry.getAllSelectedOptions();//returns selected values
dropdowncountry.getFirstSelectedOption();//return firsts selected one--webelement
//dropdowncountry.deselectByIndex(0);//it will deselect the value;

for(int i=0;i<=allvalues.size()-1;i++)
{
	System.out.println(allvalues.get(i).getText());
}


	}

}
