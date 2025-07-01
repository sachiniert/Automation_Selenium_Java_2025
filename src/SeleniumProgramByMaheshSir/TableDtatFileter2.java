package SeleniumProgramByMaheshSir;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDtatFileter2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver	 driver= new ChromeDriver();
	     driver.get("https://testingmasters.weebly.com/webtables.html");
	Thread.sleep(4000);

	List<WebElement>allcheck=driver.findElements(By.xpath("//td[8]//select//option[text()='Accepted' and @selected='selected']/parent::select/parent::td/preceding-sibling::td[7]"));

	for(int i=0;i<=allcheck.size()-1;i++)
	{

		allcheck.get(i).click();
	}

	}

}
