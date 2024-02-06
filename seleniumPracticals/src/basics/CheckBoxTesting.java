package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTesting {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		
		WebElement toglebtn= driver.findElement(By.xpath("//button[@title='Toggle']//*[name()='svg']"));
		toglebtn.click();
		WebElement checkbox=driver.findElement(By.xpath("//span[@class='rct-checkbox']//*[name()='svg']"));
        boolean isSelected=checkbox.isSelected();
        if(isSelected==false)
        {
        	checkbox.click();
        }
        WebElement text= driver.findElement(By.xpath("//span[normalize-space()='desktop']"));
		text.getText();
		System.out.println(text.getText());
	}

}
