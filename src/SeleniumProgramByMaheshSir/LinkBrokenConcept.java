package SeleniumProgramByMaheshSir;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkBrokenConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");	
		WebDriver	 driver= new ChromeDriver();
	     
		// Navigate to BStackDemo Website
				driver.get("https://www.google.com/");
				
				// Finding all the available links on webpage
				List<WebElement> links = driver.findElements(By.tagName("a"));


				// Iterating each link and checking the response status
				for (WebElement link : links) 
				{
				String linkurl = link.getAttribute("href");
				verifyLink(linkurl);
				}
				driver.quit();
				}		
	public static void verifyLink(String linkurl) {
		try 
		{
		URL link = new URL(linkurl);
		HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
		httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
		httpURLConnection.connect();//send the request to server
		if (httpURLConnection.getResponseCode() == 200) {
		System.out.println(linkurl + " - " + httpURLConnection.getResponseMessage());
		} else {
		System.out.println(linkurl + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
		}
		} catch (Exception e) 
		{
		System.out.println(linkurl + " - " + "is a broken link");
		}
	}

}
