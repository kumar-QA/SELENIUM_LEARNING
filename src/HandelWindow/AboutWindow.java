package HandelWindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
	/*************getWindowHandle()******************/

		//	String parentwindow=driver.getWindowHandle();
        //	System.out.println("Parent window id is: "+parentwindow);

   /*************getWindowHandel*************************/		
		driver.findElement(By.id("newWindowBtn")).click();
		 Set<String> Windowids=driver.getWindowHandles();
		 
		 String parentid;
		 String childid;
	   Iterator<String>	id= Windowids.iterator();
		parentid=id.next();
		childid=id.next();
		driver.switchTo().window(childid);
		
		driver.findElement(By.id("firstName")).sendKeys("kumar");
		driver.switchTo().window(parentid);
		driver.findElement(By.id("name")).sendKeys("we are back");
		
		driver.quit();
		
	}

}
