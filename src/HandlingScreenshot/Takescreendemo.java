package HandlingScreenshot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreendemo {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tools4testing.com/contents/selenium/selenium-webdriver");
	
		/*
		 TakeScreenshot
--------------
it is interface which consist of some method which implemented by RemoteWebDriver

getScreenShotAs(Output.File)-----it is method which is used to take screenshot
		 */
		
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   FileUtils.copyFile(src, new File("D:\\EclipseWorkpace\\SeleniumNovemberBacth\\screenshots\\img1.png"));
		    
	}

}
