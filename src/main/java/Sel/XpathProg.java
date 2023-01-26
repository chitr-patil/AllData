package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathProg {
	public static void main(String[]args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(2000);
		//Xpath by attribute
		WebElement rediffSmallLogo = driver.findElement(By.xpath("//img[@class='halflogo']"));
		//Xpath by text
		WebElement redifflink = driver.findElement(By.xpath("//a[text()='rediff.com']"));
		//xpath by contains
		WebElement fullNameTextbox = driver.findElement(By.xpath("//div[contains(@class,'toptabsdiv')]"));
		WebElement emailId = driver.findElement(By.xpath("//input[@name='emailid']"));
		WebElement passWord = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement repassWord = driver.findElement(By.xpath("//div[text()='Retype password']"));
	}

}
