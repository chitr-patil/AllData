package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertProg2 {                             // run hot nhi prog

	public static void main(String[] args) throws Exception {
  
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(10000);
		Alert x = driver.switchTo().alert();
		x.accept();
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(10000);
		Alert y= driver.switchTo().alert();               // Exception- NoAlertPresentException 
		y.accept();
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(10000);
		Alert z = driver.switchTo().alert();
		z.dismiss();
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Alert a= driver.switchTo().alert();
		a.accept();
		Thread.sleep(10000);
		String text = a.getText();
		System.out.println("Chitra Digvijay Patil");
		Thread.sleep(2000);
		driver.close();
	}

}
