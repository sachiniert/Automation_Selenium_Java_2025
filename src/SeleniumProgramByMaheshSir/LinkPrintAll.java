package SeleniumProgramByMaheshSir;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPrintAll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");	
		WebDriver	 driver= new ChromeDriver();
	     driver.get("https://www.google.com/");
	     Thread.sleep(5000);
List<WebElement>alllinks=driver.findElements(By.tagName("a"));

for(int i=0;i<=alllinks.size()-1;i++)
{
System.out.println(	alllinks.get(i).getText());
}
	}

}
