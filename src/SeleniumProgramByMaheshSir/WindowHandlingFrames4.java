package SeleniumProgramByMaheshSir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingFrames4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrom.driver", "C:\\Users\\sy945\\DriverJuly2025\\chromedriver-win64\\chromedriver-win64.exe");
		 WebDriver	 driver= new ChromeDriver();
	     driver.get("https://demo.guru99.com/test/guru99home/");
	     
	     Thread.sleep(4000);
	    // driver.switchTo().frame(1);
	    WebElement frameid= driver.findElement(By.xpath("//iframe[@name='a077aa5e']"));
	     driver.switchTo().frame(frameid);
	     
	     driver.findElement(By.xpath("//a/img[@src='Jmeter720.png']")).click();
	     driver.switchTo().defaultContent();
	}

}
