package Sel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
                               // Encapsulation
public class Screenshot2 extends Screenshot1 {
    private static WebDriver driver;
    
	public void m1() throws Exception 
	{
		 WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
		    searchBox.sendKeys("Latest songs");
		    WebElement searchButton = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		    searchButton.click(); 
		    Thread.sleep(2000);
	}
    
	public void m2() throws Exception
	{
		   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   File desti=new File("C:\\Users\\Dell\\eclipse-workspace\\SelProject\\Screenshot\\Photo7.jpeg");
		   FileHandler.copy(source,desti);
		   
	}
	public static void main(String[]args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
	   
		Screenshot2 x=new Screenshot2();
		x.m1();
		x.m2();
	    
	 
	   
	   driver.close();
	   
	}

}
