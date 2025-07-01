package SeleniumProgramByMaheshSir;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandlesCountFrames {

	public static void main(String[] args) throws InterruptedException {
		// count how many frames in webpages

		 WebDriver	 driver= new ChromeDriver();
	     driver.get("https://demo.guru99.com/test/guru99home/");
	     List<WebElement> allframes =driver.findElements(By.tagName("iframe"));
	     System.out.println(allframes.size());
	}

}
