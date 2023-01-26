package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDiv {

	public static void main(String[] args) throws Exception {
     
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");                         // Prog save krtana prob yetoy.
		driver.findElement(By.xpath("//button[text()='✕']")).click();    // ethe text method ch use kravi lagel cz attribute value is dinyamic
		Thread.sleep(2000);
		driver.close();
		
	}

}
