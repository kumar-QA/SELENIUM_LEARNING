package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
//		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		
	}

}
