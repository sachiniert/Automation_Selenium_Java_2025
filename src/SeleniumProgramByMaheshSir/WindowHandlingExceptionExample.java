package SeleniumProgramByMaheshSir;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingExceptionExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		List<WebElement> allframes = driver.findElements(By.tagName("iframe"));
		
		System.out.println(allframes.size());
		Thread.sleep(4000);
		
		for(int i=0; i<=allframes.size()-1;i++)
		{
			driver.switchTo().frame(i);

			try
			{
				WebElement link = driver.findElement(By.xpath("//a/img[@src='Jmeter720.png']"));
				if(link.isEnabled())
				{
					link.click();
				}
			}
			catch(Exception E)
			{
				driver.switchTo().defaultContent();
			}
			
		}

	}

}
