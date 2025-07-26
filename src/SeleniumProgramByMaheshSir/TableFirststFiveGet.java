package SeleniumProgramByMaheshSir;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableFirststFiveGet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrom.driver", "C:\\Users\\sy945\\DriverJuly2025\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver	 driver= new ChromeDriver();
	     driver.get("https://testingmasters.weebly.com/webtables.html");
	     Thread.sleep(5000);

	     List<WebElement>first6=driver.findElements(By.xpath("(//table[@id='VisitingTable']//tbody//tr/td[1])[position()<6]"));

	     for(int i=0; i<=first6.size()-1; i++)
	     {
	    	 
	    	 first6.get(i).click();
	     }
	}

}
