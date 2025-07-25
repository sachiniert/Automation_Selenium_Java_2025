package SeleniumProgramByMaheshSir;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericMethod extends SeleniumConcept {
//added method for select dropdown methid bt id --@sachin
	public static void select_ID(int index, WebElement ele)
	{
		
		Select dropdown = new Select(ele);
		dropdown.selectByIndex(index);
		
	}
	
//	public static void checkbox_click(String checkbox, List<WebElement>)
//	{
//	
//	}
//	
	public static void Draganddrop(WebElement source, WebElement destination)
	{
		Actions Act = new Actions(SeleniumConcept.driver);
		Act.dragAndDrop(source, destination).build().perform();
	}
}


