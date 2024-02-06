package asssignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
	   String url="https://demowebshop.tricentis.com/";
	   driver.get(url);
	   //maxize window
	   driver.manage().window().maximize();
	   //finding element of searchbox
	   WebElement gSearch=driver.findElement(By.id("small-searchterms"));
	   gSearch.sendKeys("Desktop");
	   WebElement btn=driver.findElement(By.className("button-1"));
	   btn.click();
	   
	   String currenturl=driver.getCurrentUrl();
	   System.out.println( currenturl);
	   if(url.equals(currenturl)) 	
	   {
	     System.out.println("url are same");
	   }
	   else
	   {
		System.out.println("url not same");  
	   }
	   List<WebElement> LinkElements=driver.findElements(By.tagName("a"));
	   for (WebElement link:LinkElements)
	   {
		   System.out.println(link.getText());
	   }
	  //driver.close();

	}

}
