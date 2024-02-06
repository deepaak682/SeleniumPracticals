package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogleSearch {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		String url="https://www.google.com/";
		driver.get(url);
		WebElement A=driver.findElement(By.id("APjFqb"));
		A.sendKeys("https://www.amazon.in/"+ Keys.ENTER);
		WebElement gsearch=driver.findElement(By.className("LC20lb"));
		gsearch.click();
		driver.manage().window().maximize();
		WebElement B=driver.findElement(By.id("twotabsearchtextbox"));
		B.sendKeys("smart phone"+ Keys.ENTER);
		
		List<WebElement> LinkElements=driver.findElements(By.tagName("a"));
		for( WebElement link:LinkElements) {
	    System.out.println(link);
			
		}
	String	crnturl=driver.getCurrentUrl();
    System.out.println(crnturl);
	}

}
