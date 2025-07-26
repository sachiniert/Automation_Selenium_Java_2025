package SeleniumProgramByMaheshSir;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class TableValueFilter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrom.driver", "C:\\Users\\sy945\\DriverJuly2025\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver	 driver= new ChromeDriver();
	     driver.get("https://testingmasters.weebly.com/webtables.html");
	Thread.sleep(4000);

	List<WebElement>allcheck=driver.findElements(By.xpath("//table[@id='VisitingTable']//tbody//tr/td[1]"));


	for(int i=allcheck.size();i>= allcheck.size()-4   ;i--)
	{
		driver.findElement(By.xpath("(//table[@id='VisitingTable']//tbody//tr/td[1])[position()=" +i+ "]")).click();
	}
	}
}
