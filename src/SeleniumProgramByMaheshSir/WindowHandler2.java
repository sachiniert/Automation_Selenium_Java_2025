package SeleniumProgramByMaheshSir;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrom.driver", "C:\\Users\\sy945\\DriverJuly2025\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver	 driver= new ChromeDriver();
	     driver.get("https://naukri.com/");
	     
	     String parentWindow = driver.getWindowHandle();
	     System.out.println(parentWindow);
	     
	    // driver.findElement(By.xpath("//span[@title='Remote']")).click();
	     Set<String> allwindow = driver.getWindowHandles();
	     System.out.println(allwindow);//nak,cts,capg
	     
	     for(String currentwindow:allwindow)
	     {
	    	 
	    	 if(!currentwindow.equals(allwindow))
	    	 {
	    		 driver.switchTo().window(currentwindow)	;
	    		 Thread.sleep(4000);
	    		 if("Welcome to CTS".equals(driver.getTitle()))
	    		 {
	    			 driver.findElement(By.xpath("//span[@title='Work from office']")).click();
	    		 }
	    		 else
	    		 {
	    			 driver.close();
	    		 }
	    	 }
	     }

	}

}
