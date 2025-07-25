package SeleniumProgramByMaheshSir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumConcept {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrom.driver", "C:\\Users\\sy945\\DriverJuly2025\\chromedriver-win64\\chromedriver-win64.exe");
	driver= new ChromeDriver();
	/*
	 // all comment are for Genereci method use if remove comments work for genericmethod 
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	WebElement dropdown = driver.findElement(By.xpath(null));
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	// Bellow all comments for drpdown only
	WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']"));
	GenericMethod.select_ID(10, dropdown);
	GenericMethod.Draganddrop(dropdown, dropdown);
*/
	driver.get("https://demo.guru99.com/test/radio.html");
	//ChekboxForGeneric.checkbox("checkbox2", ChekboxForGeneric.WebElementcheckbox);
	ChekboxForGeneric.checkbox("checkbox3", ChekboxForGeneric.WebElementcheckbox);
	}

}
