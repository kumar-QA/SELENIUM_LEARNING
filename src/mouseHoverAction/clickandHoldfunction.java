package mouseHoverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickandHoldfunction {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
	WebElement firstframe=driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(firstframe);
		
		WebElement srcele=driver.findElement(By.id("draggable"));
		WebElement destele=driver.findElement(By.id("droppable"));
		
		Actions action =new Actions(driver);
		action.clickAndHold(srcele)
		.moveToElement(destele)
		.release()
		.perform();
	}
}
