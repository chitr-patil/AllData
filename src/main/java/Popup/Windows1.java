package Popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows1 {

	public static void main(String[] args) throws InterruptedException {
 
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.aspsnippets.com/demos/1102/");
	
	driver.findElement(By.xpath("//input[@value='Open Popup']")).click();
	
	driver.close();
		
	}

}
