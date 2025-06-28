package SeleniumSelfPractise;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumRahulAcademyLoginPractise {
	public static By username= By.id("inputUsername");
	public static By password = By.name("inputPassword");
	public static By checkbox1 = By.id("chkboxOne");
	public static By checkbox2 = By.id("chkboxTwo");
	public static By loginbtn = By.className("submit");
	
	public static String UsernameText= "rahul";
	public static String PasswordText = "rahulshettyacademy";
    public static  WebDriver driver;
    
    
	public static void main(String[] args) {
		driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		usernamedetails(UsernameText,username);
		Passwordzdetails(PasswordText,password);
		
		CheckBoxOne(checkbox1);
		CheckBoxTwo(checkbox2);
		LoginBtnClick(loginbtn);
		
		//driver.close();
		System.out.println(driver.findElement(By.xpath("//p[contains(@style,'color:')]")).getText());
		
		
	}
	
	public static void usernamedetails(String UsernameText, By username)
	{
		driver.findElement(username).sendKeys(UsernameText);
	}
	public static void Passwordzdetails(String PasswordText,By password )
	{
		
		driver.findElement(password).sendKeys(PasswordText);
	}
	public static void CheckBoxOne(By checkbox1)
	{
		driver.findElement(checkbox1).click();
	}
	public static void CheckBoxTwo(By checkbox2)
	{
		driver.findElement(checkbox2).click();
	}
	public static void LoginBtnClick(By loginbtn)
	{
		driver.findElement(loginbtn).click();
		
	}

}
