package SeleniumProgramByMaheshSir;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoitUploadResume {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrom.driver", "C:\\Users\\sy945\\DriverJuly2025\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver	 driver= new ChromeDriver();
	     driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531");
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//p[text()='  I have work experience (excluding internships)']")).click();
	     driver.findElement(By.xpath("//*[contains(text(),'Upload Resume')]")).click();
	     
	     Runtime.getRuntime().exec("C:\\Users\\sy945\\OneDrive\\Desktop\\Autoit\\file1.exe");
	     
	     // This program is not working
	     
	}

}
