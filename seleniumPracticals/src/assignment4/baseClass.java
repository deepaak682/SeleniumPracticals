package assignment4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class baseClass implements MethodsInterface 
{
	WebDriver driver;
	
	@Override
	public void login()  {
		
		driver=new ChromeDriver();

		
		driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%25252Fadmin%25252F");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//WebElement id=driver.findElement(By.xpath("//input[@id='Email']"));
        //id.clear();
		//id.sendKeys("admin@yourstore.com");
		//WebElement pwdbtn=driver.findElement(By.xpath("//input[@id='Password']"));
		//pwdbtn.clear();
		//pwdbtn.sendKeys("admin@yourstore.com");
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();			
	}

	@Override
	public void findElements() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement catalogbtn=driver.findElement(By.xpath("//p[normalize-space()='Catalog']"));
		catalogbtn.click();	
		WebElement categorybtn=driver.findElement(By.xpath("	//p[normalize-space()='Categories']"));
		categorybtn.click();
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='SearchPublishedId']"));
		Select select=new Select (dropdown);	
		select.selectByIndex(1);
		WebElement search=driver.findElement(By.xpath("//button[@id='search-categories']"));
		search.click();
		WebElement checkbox=driver.findElement(By.xpath("//div[@class='dataTables_scrollHeadInner']//input[@type='checkbox']"));
	    boolean isSelected = checkbox.isSelected();
	    if( isSelected==false) {
	    	 checkbox.click();
	     }

	     
	                                  
		
	}

	@Override
	public void logout() {	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement logout=driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
	    logout.click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		
	}

	@Override
	public void teardown() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.close();
		
	}
	

}
