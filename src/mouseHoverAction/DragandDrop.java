package mouseHoverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
	WebElement firstframe=driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(firstframe);
		
		WebElement srcele=driver.findElement(By.id("draggable"));
		WebElement destele=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(srcele, destele).perform();
		
		
		
		
		
	}

}
