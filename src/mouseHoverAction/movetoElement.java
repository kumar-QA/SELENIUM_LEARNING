package mouseHoverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movetoElement {

	public static void main(String[] args) throws InterruptedException {
		
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	driver.manage().window().maximize();
	
	WebElement blogmenu=driver.findElement(By.id("blogsmenu"));
	
    WebElement thirdLink=driver.findElement(By.xpath("//span[contains(text(),'SeleniumOneByArun')]"));
	Actions act=new Actions(driver);
	Thread.sleep(2000);
	act.moveToElement(blogmenu);
	act.moveToElement(thirdLink).click().perform();

	
		
	}

}
