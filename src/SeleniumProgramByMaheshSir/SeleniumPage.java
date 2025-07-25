package SeleniumProgramByMaheshSir;

import org.openqa.selenium.WebDriver;

public class SeleniumPage {
public static WebDriver driver;
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sy945\\eclipse-workspace\\chromedriver-win64\\chromedriver-win64.exe");
		
		driver.get("https://demo.guru99.com/test/radio.html");

		Pagecheckbox.checkbox("checkbox2", Pagecheckbox.WebElementcheckbox);
		//Pagecheckbox.checkbox("checkbox3", Pagecheckbox.WebElementcheckbox);
	}

}
