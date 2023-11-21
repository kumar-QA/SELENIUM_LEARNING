package javascriptexecutorConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollOperation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tools4testing.com/contents/selenium/selenium-webdriver");
		
		
	WebElement ele=driver.findElement(By.xpath("(//a[contains(text(),'Next - Webdriver Architecture →')])[1]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,700);");
		
		js.executeScript("arguments[0].scrollIntoView();",ele);
		
//		
//	WebElement appimg=driver.findElement(By.xpath("//img[@alt=\"whatsapp\"]"));
//	 js.executeScript("arguments[0].click();", appimg);
//		
			
	}
	
	
	
}
