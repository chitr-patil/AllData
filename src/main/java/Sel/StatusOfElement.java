package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusOfElement {

	public static void main(String[] args) throws Exception {
   
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://chercher.tech/practice/explicit-wait");
		WebElement button = driver.findElement(By.xpath("//button[@id='disable']"));
		System.out.println(button.isDisplayed());
		System.out.println(button.isEnabled());
		System.out.println("_________________________________");
		driver.findElement(By.xpath("//button[@id='enable-button']")).click();
		Thread.sleep(10000);
		System.out.println(button.isDisplayed());
		System.out.println(button.isEnabled());
		Thread.sleep(2000);
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkBox.click();
		Thread.sleep(2000);
		System.out.println(checkBox.isSelected());
		driver.close();
		
	}

}
