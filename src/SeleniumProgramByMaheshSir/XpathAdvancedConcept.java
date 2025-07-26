package SeleniumProgramByMaheshSir;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAdvancedConcept {
	
	
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrom.driver", "C:\\Users\\sy945\\DriverJuly2025\\chromedriver-win64\\chromedriver-win64.exe");
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/");
		//print current score
		
	//	System.out.println(driver.findElement(By.xpath("//p[text()='WSF']//parent::div//parent::div//div//strong")).getText());
		System.out.println(driver.findElement(By.xpath("//p[text()='IND']//parent::div//parent::div//div//sibling::strong")).getText());
		System.out.println(driver.findElement(By.xpath("//p[text()='ENG']//parent::div//parent::div//div//strong[2]")).getText());
		driver.close();

	}

}
