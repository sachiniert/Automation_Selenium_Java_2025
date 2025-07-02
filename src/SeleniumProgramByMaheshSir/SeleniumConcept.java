package SeleniumProgramByMaheshSir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumConcept {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	driver= new ChromeDriver();
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	WebElement dropdown = driver.findElement(By.xpath(null));
	GenericMethod.select_ID(10, dropdown);
	GenericMethod.Draganddrop(dropdown, dropdown);

	}

}
