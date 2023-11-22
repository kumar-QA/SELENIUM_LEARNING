package HandelWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompleteTableData {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
	List<WebElement> columns=driver.findElements(By.xpath("//table[@id=\"table1\"]/thead/tr/th"));
	int rowcount=driver.findElements(By.xpath("//table[@id=\"table1\"]/tbody/tr")).size();
	int columncount=columns.size();
		
	for (int i = 0; i < columns.size(); i++) {
		  System.out.print(columns.get(i).getText()+"  ");
	}
	
	System.out.println();
	  for (int i = 1; i <= rowcount; i++) {
		 
		  for (int j = 1; j <= columncount; j++) {
			
			  System.out.print(driver.findElement(By.xpath("//table[@id=\"table1\"]/tbody/tr["+i+"]/td["+j+"]")).getText()+"  ");
		}
		System.out.println();
	}
	
		
	}

}
