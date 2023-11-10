import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelLinks {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
	List<WebElement>links=driver.findElements(By.tagName("a"));
	System.out.println("No of links in the website is : "+links.size());
	for (int i = 0; i <links.size() ; i++) {
		System.out.println(links.get(i).getText());
	}	
	driver.findElement(By.id("selenium143")).click();
	}

	
}
