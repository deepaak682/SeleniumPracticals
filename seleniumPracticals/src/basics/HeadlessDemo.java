package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessDemo {

	public static void main(String[] args) {
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("https://www.google.com/");
		System.out.println("the title of page" + driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("testing");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.google.com/search?q=testing&sca_esv=790f6f6ade13e5d3&sxsrf=ACQVn0-vAlS45MSJMJQmgFx7qdj4O-gCfQ%3A1706939684664&source=hp&ei=JNW9Zb6iJsWu0-kPpca40Ag&iflsig=ANes7DEAAAAAZb3jNA7CVb6duwV5dmA6VtVC9W9sjdKq&oq=&gs_lp=Egdnd3Mtd2l6IgAqAggAMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnSN4OUABYAHABeACQAQCYAQCgAQCqAQC4AQHIAQCoAgo&sclient=gws-wiz");
	     String NEWTITLE=driver.getTitle();
	     System.out.println("newtitle" + NEWTITLE);
	     String curnturl=driver.getCurrentUrl();
	     System.out.println("currenturl" + curnturl);
	}

}
