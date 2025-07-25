package SeleniumProgramByMaheshSir;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	 driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("testing@gmail.com");
	 //div[@jsmodel='b5W85 vNzKHd']//input[@value
		

	}

}
