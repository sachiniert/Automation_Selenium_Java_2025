package SeleniumProgramByMaheshSir;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxIsSelected {
	
	//if checkboccx allredy selected print on console

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrom.driver", "C:\\Users\\sy945\\DriverJuly2025\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		List<WebElement> Allcheckbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(Allcheckbox.size());
		Thread.sleep(3000);
		for(int i=0; i<=Allcheckbox.size()-1;i++)
		{
			if("checkbox2".equals(Allcheckbox.get(i).getAttribute("value")))
					{
			        	if(Allcheckbox.get(i).isSelected())
			        	{
			        		System.out.println("Selected");
			        	}
			        	else
			        	{
			        		Allcheckbox.get(i).click();		        	}
					}

		}

	}

}
