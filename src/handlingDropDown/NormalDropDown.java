package handlingDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NormalDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		/******************** Normal DropDown *************/

		WebElement dropBtn = driver.findElement(By.id("drop1"));
		Select sel = new Select(dropBtn);
//		sel.selectByIndex(3);
//		sel.selectByValue("ghi");
		sel.selectByVisibleText("doc 4");
//		
		/********** Bootstrap DropDown *************/

		driver.findElement(By.xpath("//button[@onclick=\"setTimeout(myFunction,3000)\"]")).click();
		Thread.sleep(5000);
		List<WebElement> listofElement = driver.findElements(By.xpath("//div[@id=\"myDropdown\"]/a"));

		for (int i = 0; i < listofElement.size(); i++) {
			if (listofElement.get(i).getText().equals("Flipkart")) {
				listofElement.get(i).click();

			}

		}

	}

}
