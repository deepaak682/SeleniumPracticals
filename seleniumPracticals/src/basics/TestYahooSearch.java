package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestYahooSearch {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.get("https:\\www.yahoo.com");
		WebElement gSearch = driver.findElement(By.id("ybar-sbq"));
		gSearch.sendKeys("cricket"+ Keys.ENTER);
		
		//WebElement gbtn = driver.findElement(By.name("k"));
		//gbtn.click();

	}

}
