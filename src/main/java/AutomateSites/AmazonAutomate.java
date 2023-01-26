package AutomateSites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAutomate {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	   WebElement phoneNoTextbox = driver.findElement(By.xpath("//input[@name='email']"));
	   phoneNoTextbox.sendKeys("7666321174");
	   driver.findElement(By.xpath("//input[@id='continue']")).click();
	   WebElement passwordTextbox = driver.findElement(By.xpath("//input[@type='password']"));
	   passwordTextbox.sendKeys("Cp@123");
	   driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	   
	   WebElement searchTextBox = driver.findElement(By.xpath("//input[@name='field-keywords']"));
	   searchTextBox.sendKeys("baby walker");
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	   driver.findElement(By.xpath("//img[@alt='TiedRibbons® Cycle Shape Flower Vase with Peonies Bunches']")).click();
	   
		driver.close();
	}

}
