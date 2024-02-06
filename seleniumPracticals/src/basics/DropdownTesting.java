package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTesting {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select select=new Select(dropdown);
		List<WebElement> lst=select.getOptions();
		System.out.println(lst);
		for(WebElement elements:lst) {
			System.out.println(elements.getText());
		}
		System.out.println("INDEX VALUE IS" );
		select.selectByIndex(3);
	    //select.getFirstSelectedOption().getText();
	    System.out.println(select.getFirstSelectedOption());
	    select.selectByVisibleText("Red");
	    System.out.print(select.getFirstSelectedOption());
	    
	
		
		
		
	}

}
