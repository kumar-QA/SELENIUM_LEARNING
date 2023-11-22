package HandelWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParticularDataInATable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		
		String columnumber2=driver.findElement(By.xpath("//table[@id=\"table1\"]/thead/tr/th[2]")).getText();
		System.out.println(columnumber2);
	
		String data=driver.findElement(By.xpath("//table[@id=\"table1\"]/tbody/tr[3]/td[3]")).getText();
		System.out.println(data);
	}

}
