package ActionClassProg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog1 {

	public static void main(String[] args) throws Exception {
        
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		WebElement userName = driver.findElement(By.xpath("//input[@id='user-number']"));
		WebElement emailAddress = driver.findElement(By.xpath("//input[@id='email_id']"));
		WebElement contBtn =driver.findElement(By.xpath("//button[@id='irtct-acc-detail']"));
		userName.sendKeys("9090909012");
		 Thread.sleep(2000);
		 emailAddress.sendKeys("h@gmail.com");
		 Thread.sleep(2000);
		contBtn.click();
		 Thread.sleep(2000);
		 WebElement occDropdown = driver.findElement(By.xpath("//button[normalize-space(text())='Select Occupation']"));  // //button[@aria-expanded='true']=value change hote.dropdown vr click kl tr true yetay,ani n click krtana false yetay.attribute ne 1 of 1 asun pn prog 29 la error yet ahe             
		 Actions a=new Actions(driver);
		 a.moveToElement(occDropdown).click().build().perform(); // //button[normalize-space(text())='Select Occupation']
		 for(int i=0;i<5;i++)
		 {
			 Thread.sleep(2000);
			 a.sendKeys(Keys.DOWN).build().perform();
		 }
		 Thread.sleep(2000);
		 a.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(5000);
		 driver.close();
	}

}
