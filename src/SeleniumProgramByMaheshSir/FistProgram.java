package SeleniumProgramByMaheshSir;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class FistProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "chromdriverpath")
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.fb.com");
		
		//driver.get("https://www.fb.com");//launching the browser
		//driver.manage().window().maximize();//maxmiuming the browser
	   //driver.manage().window().minimize();
//1 method 
	    //driver.findElement(By.id("email")).sendKeys("testing@gmail.com");
	    //driver.findElement(By.id("email")).clear();
		//driver.findElement(By.id("email")).sendKeys("testingselenium@gmail.com");
		//String entereddata = driver.findElement(By.id("email")).getDomProperty("value");
		//System.out.println(entereddata);
		
//2nd method below	
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("testing@gmail.com");
		
//3 method below
		//By emailid = By.id("email");
		//driver.findElement(emailid).sendKeys("testing");
		
//4th method	
		
	}
}
