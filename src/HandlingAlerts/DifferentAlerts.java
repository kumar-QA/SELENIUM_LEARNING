package HandlingAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		/*********************Normal Alert**************************/
		
//		driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		
		/****************Confirmation Alert******************/
//		driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().dismiss();
		
		/****************Prompt Alerts******************/
		
		driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
		Thread.sleep(3000);
	    Alert al=driver.switchTo().alert();		
		al.sendKeys("hi");
		al.accept();
		
		
		
	}

}
