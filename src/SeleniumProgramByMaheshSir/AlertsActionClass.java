package SeleniumProgramByMaheshSir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertsActionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrom.driver", "C:\\Users\\sy945\\DriverJuly2025\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver	 driver= new ChromeDriver();
	     driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	     Actions ACT = new Actions(driver);
	   WebElement link= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	    ACT.doubleClick(link).build().perform();
	    
	    
	    if("You double clicked me.. Thank You..".equals(driver.switchTo().alert().getText()))
	    {
	    	driver.switchTo().alert().accept(); //ok
	    	
	    }else
	    {
	    	driver.switchTo().alert().dismiss();//cancel
	    }
	    
	    
	     

	}

}
