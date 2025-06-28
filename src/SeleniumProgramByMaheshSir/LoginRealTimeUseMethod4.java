package SeleniumProgramByMaheshSir;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginRealTimeUseMethod4 {
	//public static By emailid= By.id("email");
	//public static By emailpassword = By.name("pass");
	//public static By Loginby = By.name("login");
	//public static By forgottenpasswordBy = By.linkText("Forgotten password?");
	//public static By forgottenpasswordBYpartially = By.partialLinkText("Forgot");
	public static By createnewaccountBy = By.className("_42ft");
	
	public static String EmailText = "testing@gmail.com";
	public static String EmailPasswordtext = "P23345@2";
	
	public static WebDriver driver;
	

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "chromdriverpath");

		driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		//EnterEmailid(EmailText,emailid);
		//EnterPassword(EmailPasswordtext,emailpassword);
		//Login(Loginby);
		// add(10,20);
		createnewaccount(createnewaccountBy);
		
		//forgottenpassword(forgottenpasswordBy);
		//forgottenpasswordBYpariallymethod(forgottenpasswordBYpartially);
	}
	//public static void add(int x, int y)
	//{
		
	//}
	public static void createnewaccount(By createnewaccountBy)
	{
		driver.findElement(createnewaccountBy).click();
	}
	/*
	public static void forgottenpasswordBYpariallymethod(By forgottenpasswordBYpartially)
	{
		driver.findElement(forgottenpasswordBYpartially).click();
	}
	
	public static void forgottenpassword(By forgottenpasswordBy)
	{
		driver.findElement(forgottenpasswordBy).click();
	
	}
	
	
	public static void Login(By loginby)
	{
		driver.findElement(loginby).click();
	}
	public static void EnterPassword(String EmailPasswordtext, By emailpassword)
	{
		driver.findElement(emailpassword).sendKeys(EmailPasswordtext);
	}
	public static void EnterEmailid(String EmailText, By EmailidBy)
	{
		driver.findElement(EmailidBy).sendKeys(EmailText);
	}*/

}
