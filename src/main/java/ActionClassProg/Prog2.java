package ActionClassProg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog2 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightClickMeButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement doubleClickMeButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

		/*Actions a=new Actions(driver);
		a.moveToElement(rightClickMeButton).contextClick().build().perform();
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(4000);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);*/
        
		Actions b = new Actions(driver);
	   // b.moveToElement(doubleClickMeButton).doubleClick().build().perform();
		b.doubleClick(doubleClickMeButton).build().perform();
		Thread.sleep(5000);
		driver.close();
	}

}
