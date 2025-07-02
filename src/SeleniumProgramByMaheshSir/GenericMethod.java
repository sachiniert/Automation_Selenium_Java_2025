package SeleniumProgramByMaheshSir;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericMethod extends SeleniumConcept {

	public static void select_ID(int index, WebElement ele)
	{
		
		Select dropdown = new Select(ele);
		dropdown.selectByIndex(index);
		
	}
	
	public static void Draganddrop(WebElement source, WebElement destination)
	{
		Actions Act = new Actions(SeleniumConcept.driver);
		Act.dragAndDrop(source, destination).build().perform();
	}
}


