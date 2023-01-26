package Sel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot4 {   // Polymorphism
   static WebDriver driver;
	public void n1() throws Exception
	{
		 WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
		    searchBox.sendKeys("Baby cosmetics");
		    WebElement searchButton = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		    searchButton.click(); 
		    Thread.sleep(2000);
	}
	public void n1(int a) throws Exception
	{
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   File desti=new File("C:\\Users\\Dell\\eclipse-workspace\\SelProject\\Screenshot\\Photo6.jpeg");
		   FileHandler.copy(source,desti);
		   
	}
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
	   
		Screenshot4 ref=new Screenshot4();
		ref.n1();
		ref.n1(10);
		driver.close();
	}

}
