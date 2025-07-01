package SeleniumProgramByMaheshSir;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver	 driver= new ChromeDriver();
	     driver.get("https://naukri.com/");
	     
	     String parentWindow = driver.getWindowHandle();
	     System.out.println(parentWindow);
	     
	     driver.findElement(By.xpath("//span[@title='Remote']")).click();
	     Set<String> allwindow = driver.getWindowHandles();
	     System.out.println(allwindow);
	     
	     for(String currentwindow:allwindow)
	     {
	    	 if(!currentwindow.equals(parentWindow))
	    	 {
	    		 driver.switchTo().window(currentwindow);
	    		 Thread.sleep(4000);
	    		 driver.findElement(By.xpath("//span[@title='Work from office']")).click();
	    		 driver.close();
	    	 }
	     }
	     driver.switchTo().window(parentWindow);
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//span[@title='MNC']")).click();
	}

}
