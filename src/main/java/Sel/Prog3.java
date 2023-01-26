package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog3 {

	public static void main(String[] args) throws Exception {
   
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://is.rediff.com/signup/register");
		driver.findElement(By.tagName("input")).sendKeys("Chitra Digvijay Patil");
		Thread.sleep(2000);
		//driver.findElement(By.tagName("input")).sendKeys("chitraPatil@gmail.com");
		driver.findElement(By.id("emailid")).sendKeys("patilchitra977@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("chitra@123");
		Thread.sleep(2000);
		driver.findElement(By.name("repass")).sendKeys("chitra@123");
		Thread.sleep(2000);
		//driver.findElement(By.id("sex")).click();
		//Thread.sleep(2000);
		driver.findElement(By.name("sex")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("date_day")).click();
		Thread.sleep(2000);
		//driver.findElement(By.tagName("17")).click();
		driver.findElement(By.id("date_mon")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Date_Year")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("txtbox1")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.className("col1")).sendKeys("A.B.S.HighSchool Asurle Porle");
		Thread.sleep(2000);
		driver.findElement(By.id("college")).sendKeys("Chh.Shahu Clg Kolhapur.");
		Thread.sleep(2000);
		driver.findElement(By.linkText("rediff.com")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("r")).click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
