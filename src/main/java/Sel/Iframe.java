package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

public static void main(String[]args) throws Exception
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	driver.manage().window().maximize();
	driver.switchTo().frame("iframeResult");
	WebElement timeDisplayButton = driver.findElement(By.xpath("//button[@type='button']"));
	timeDisplayButton.click();
	Thread.sleep(2000);
	driver.switchTo().parentFrame();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	Thread.sleep(2000);
	driver.close();
	
}

}
