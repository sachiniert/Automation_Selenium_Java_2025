package SeleniumProgramByMaheshSir;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {
	/*
	public static By emailId= By.xpath("//input[@name='email']");
	public static By AndOrMethod= By.xpath("//input[@name='narshIt' or @placeholder='Email address or phone number']");
	public static By containsVal= By.xpath("//input[contains(@placeholder,'address or')]");
	*/
	public static By startWith=By.xpath("//input[starts-with(@aria-label,'Email ad')]");
	public static By password= By.xpath("//input[@name='nareshit' or @placeholder='Password']");

	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.findElement(startWith).sendKeys("sachin@gmail.com");
		driver.findElement(password).sendKeys("sachin@123");
		
		String Actualtext=driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).getText();

		String Expectetext="Facebook helps you connect and share with the people in your life.";

		if(Actualtext.equals(Expectetext))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}
	/*
	  Xpath Example
	1) xpath("//input[@name='email']
	
	2) And OR
	 xpath("//input[@name='narshIt' or @placeholder='Email address or phone number']
	 
	 3) contains
	  xpath("//input[contains(@placeholder,'address or')]
	  
	 4) Start-With
	  
	  xpath("//input[starts-with(@aria-label,'Email ad')]
	 
	  */

}
