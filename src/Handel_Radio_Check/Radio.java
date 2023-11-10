package Handel_Radio_Check;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
	List<WebElement>radioBtns=driver.findElements(By.xpath("//input[@type='radio']"));
		
	/********************count of radioBtn**********************/
		System.out.println("no of radio Btn is : "+radioBtns.size());

	/********************Text of radio Btn***********************/
		
		for (WebElement ele : radioBtns) {
			System.out.println(ele.getAttribute("value"));
		}
		
	/******************Selecting particular radio Btn***********************/
		
		driver.findElement(By.xpath("//input[@value='Car']")).click();
		
	
	/************Select a radio btn from the list**************************/	
		
		for (WebElement ele : radioBtns) {
			
			if(ele.getAttribute("value").equals("female")||ele.getAttribute("value").equals("male") ) {
				ele.click();
				System.out.println(ele.getAttribute("value")+ele.isSelected());
			}else {
				System.out.println(ele.getAttribute("value")+ele.isSelected());
			}
			
		}
		
		
		
	}

}
