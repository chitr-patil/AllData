package Sel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[]args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File desti=new File("C:\\Users\\Dell\\eclipse-workspace\\SelProject\\Screenshot\\Photo.jpg");
	    FileHandler.copy(source, desti);
	    driver.close();
	}
	

}






/*WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();*/