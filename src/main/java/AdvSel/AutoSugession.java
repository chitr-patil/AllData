package AdvSel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSugession {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("seleni");
		Thread.sleep(2000);
		
		List<WebElement> autoSugEle = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		for(int i=0;i<=autoSugEle.size()-1;i++)
		System.out.println(autoSugEle.get(i).getText());
		
		for(int i=0;i<=autoSugEle.size()-1;i++)
		{
			if(autoSugEle.get(i).getText().equals("selenium webdriver"));
			{
				autoSugEle.get(i).click();
				break;
			}
		}
		driver.close();
	
	}
}
