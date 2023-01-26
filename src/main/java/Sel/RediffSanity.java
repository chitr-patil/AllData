package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffSanity {

	public static void main(String[] args) {
  
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		WebElement rediffLink = driver.findElement(By.xpath("//a[@class='ft11']"));
		WebElement rediffLogo = driver.findElement(By.xpath("//img[@class='halflogo']"));
		//newUserLogo=driver.findElement(by)
	}

}
