package assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser {

	public static void main(String[] args) {
		
		WebDriver  driver1;
		WebDriver  driver2;
		WebDriver  driver3;
		
		//chrome browser
		driver1 = new ChromeDriver();
		driver1.get("https:\\www.google.co.in");
		
		driver2 = new FirefoxDriver();
		driver2.get("https:\\www.facebook.com");
		
		driver3 = new EdgeDriver();
		driver3.get("https:\\www.wikipedia.com");
		driver3.close();
		
	}	

}
