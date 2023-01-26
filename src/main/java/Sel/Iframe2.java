package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe2 {

	public static void main(String[] args) throws Exception {
     
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//div[@style='height: auto !important;']//input[@name='s']")).sendKeys("Chitra");
	     Thread.sleep(5000);
		driver.switchTo().frame("globalSqa");
		WebElement searchBar2 = driver.findElement(By.xpath("//header[@style='margin-top: 0px;']//input[@name='s']"));
		searchBar2.sendKeys("Patil");// wrong
		 Thread.sleep(5000);
		driver.close();
	}

}
