package mouseHoverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
	WebElement btn=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
	  Actions act=new Actions(driver);
	  act.contextClick(btn);
	  act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Quit')]"))).click().perform();
		driver.switchTo().alert().accept();
	}

}
