package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertProg3 {

	public static void main(String[] args) throws Exception {
  
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Thread.sleep(1000);
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
		Alert alt2 = driver.switchTo().alert();
		alt2.dismiss();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alt3 = driver.switchTo().alert();
		alt3.getText();
		System.out.println(alt3.getText());
		alt3.sendKeys("Chitra is a good Tester");   // sendkeys not working / we dont get the text
		Thread.sleep(2000);
		alt3.accept();
		Thread.sleep(2000);
		driver.close();
	}

}
