package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertProg {

	public static void main(String[] args) throws Exception {
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://mail.rediff.com/cgi-bin/login.cgi");  //ethe signin button vr click klyanantr jo popup yetoy to handle kraycha ahe.
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 Alert a = driver.switchTo().alert();
	 a.accept();
	 Thread.sleep(1000);	
	 driver.close();
	}

}
