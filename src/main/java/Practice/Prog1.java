package Practice;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog1 {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		
		WebElement userNumberTextbox =
				driver.findElement(By.xpath("//input[@id='user-number']"));
		WebElement emailAddTextbox =
				driver.findElement(By.xpath("//input[@id='email_id']"));
		WebElement contBtn =
				driver.findElement(By.xpath("//button[@id='irtct-acc-detail']"));
		
		userNumberTextbox.sendKeys("9090909012");
		Thread.sleep(1000);
		emailAddTextbox.sendKeys("h@gmail.com");
		Thread.sleep(1000);
		contBtn.click();
		Thread.sleep(5000);
		WebElement occDropdown =driver.findElement(By.xpath("//button[normalize-space(text())='SelectOccupation']"));
		Actions a=new Actions(driver);
		a.moveToElement(occDropdown).click().build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		driver.close();
	}
}