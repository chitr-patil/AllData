package Sel;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
  
public class FullScreenshot {
    static WebDriver driver;
	public static void m1() throws Exception
	{
	
	File source =((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\Dell\\eclipse-workspace\\SelProject\\Screenshot\\Photo3.jpeg");
	FileHandler.copy(source, dest);
	//driver.quit();
	}
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		m1();
}
	}
