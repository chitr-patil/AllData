package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog1 {

	public static void main(String[] args) throws Exception {
   
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(5000);
		driver.quit();
		
	
		
		
	}

}
