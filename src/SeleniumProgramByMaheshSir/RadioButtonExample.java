package SeleniumProgramByMaheshSir;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrom.driver", "C:\\Users\\sy945\\DriverJuly2025\\chromedriver-win64\\chromedriver-win64.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		List<WebElement> radiobtn=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radiobtn.size());
        Thread.sleep(3000);
       
			//Check if radio button is selected
        

	
	}


}
