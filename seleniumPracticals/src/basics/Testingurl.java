package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testingurl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		Thread.sleep(3000);
		
		WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userName.sendKeys("Admin");
		Thread.sleep(3000);
		WebElement pwd = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pwd.sendKeys("admin123");
		Thread.sleep(3000);
		WebElement logIn = driver.findElement(By.xpath("//button[@type='submit']"));		
		logIn.click();
		//


	}

}
