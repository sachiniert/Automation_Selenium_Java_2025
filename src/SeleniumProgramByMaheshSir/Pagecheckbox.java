package SeleniumProgramByMaheshSir;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Pagecheckbox extends SeleniumPage{
	
	public static By WebElementcheckbox= By.xpath("//input[@type='checkbox']");
	
	public static void checkbox(String name ,By WebElementcheckbox )
	{
		
		List<WebElement> allcheckbox = driver.findElements(WebElementcheckbox);
		for(int i=0; i<=allcheckbox.size()-1;i++)
		{
			if(name.equals(allcheckbox.get(i).getAttribute("value")))
			{
				
				allcheckbox.get(i).click();
			}
		}
	}

}
