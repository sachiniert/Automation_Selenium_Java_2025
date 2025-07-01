package SeleniumProgramByMaheshSir;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver	 driver= new ChromeDriver();
	     driver.get("https://naukri.com/");
	    // driver.switchTo().newWindow(WindowType.WINDOW.TAB).get("https://www.google.com");
	    driver.switchTo().newWindow(WindowType.WINDOW.WINDOW).get("https://www.google.com");
	}

}
