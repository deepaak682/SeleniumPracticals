package assignment3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new FirefoxDriver();
		String Url="https://www.flipkart.com/";
		driver.navigate().to(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//driver.get(Url);
		WebElement login=driver.findElement(By.xpath("//span[normalize-space()='Login']"));
		login.click();
		Thread.sleep(3000);

	    WebElement user=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		user.sendKeys("7760085611");
	    Thread.sleep(3000);
		WebElement otpbtn=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		otpbtn.click();
		Thread.sleep(20000);
		WebElement fsearch=driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		fsearch.sendKeys("mobile" + Keys.ENTER);
		//Thread.sleep(2000);
		WebElement phoneslect=driver.findElement(By.className("_4rR01T"));
		phoneslect.click();
		
		WebElement addtocartbtn=driver.findElement(By.className("_2KpZ6l _2U9uOA _3v1-ww"));
		addtocartbtn.click();
		
	     
		
	}

}
