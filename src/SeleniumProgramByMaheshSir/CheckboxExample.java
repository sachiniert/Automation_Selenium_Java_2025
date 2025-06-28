package SeleniumProgramByMaheshSir;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {
	        /*count how many checkbox are there ?
			  print names of checkboxes ?
			  how u ensure it checked or not ?
           */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		List<WebElement> Allcheckbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
        //count how many checkbox are there
		
		System.out.println(Allcheckbox.size());
		for(int i=0; i<=Allcheckbox.size()-1;i++)
		{
			
			if(("checkbox1".equals(Allcheckbox.get(i).getAttribute("value")) ||"checkbox2".equals(Allcheckbox.get(i).getAttribute("value"))) || ("checkbox3".equals(Allcheckbox.get(i).getAttribute("value"))))
					{
				 
				       Allcheckbox.get(i).click();
					}
		}

	}

}
