package SeleniumProgramByMaheshSir;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']"));
		
		Select countrydown = new Select(dropdown);
		//countrydown.selectByIndex(2);
		//countrydown.selectByIndex("AUSTRALIA");
		//countrydown.selectByVisibleText("BAHAMAS");
		countrydown.selectByContainsVisibleText("BAHA");

	}

}
