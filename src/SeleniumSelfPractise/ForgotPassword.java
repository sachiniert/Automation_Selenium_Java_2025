package SeleniumSelfPractise;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {
	
	public static By forgottenPassword = By.linkText("Forgot your password?");
	
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		ForgotPwd(forgottenPassword);
		
		
		

	}
	public static void ForgotPwd(By forgottenPassword)
	{
		driver.findElement(forgottenPassword).click();
	}

}
