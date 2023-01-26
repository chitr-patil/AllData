package ActionClassProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
                                                   // After mouse over on prime will get options & then click on join prime
public class Prog4 {

	public static void main(String[] args) throws Exception {
 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement primeUrl = driver.findElement(By.xpath("//span[text()='Prime']"));
		Actions a=new Actions(driver);
		a.moveToElement(primeUrl).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@id='multiasins-img-link']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
