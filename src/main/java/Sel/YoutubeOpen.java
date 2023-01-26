package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YoutubeOpen {

	public static void main(String[] args) throws Exception {
  
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		  WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
		    searchBox.sendKeys("Armaan Maalik songs");
		  //Thread.sleep(2000);
		  WebElement searchButton = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		  Thread.sleep(2000);
		  searchButton.click();
		  Thread.sleep(5000);
		  driver.close();
		  
	}

}
