package ActionClassProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
                                               // Image drag & drop
public class Prog3 {

	public static void main(String[] args) throws Exception {
  
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		WebElement highTatras1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));  
		WebElement highTatras2 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
		WebElement highTatras3 = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
		WebElement highTatras4 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
		WebElement trash = driver.findElement(By.xpath("//h4[@class='ui-widget-header']"));
		
		Actions a= new Actions(driver);
		Thread.sleep(1000);
		a.moveToElement(highTatras1).clickAndHold().moveToElement(trash).release().build().perform();
		Thread.sleep(1000);
		a.dragAndDrop(highTatras2, trash).build().perform();
		Thread.sleep(1000);
		a.dragAndDrop(highTatras3, trash).build().perform();
		Thread.sleep(1000);
		a.dragAndDrop(highTatras4, trash).build().perform();
		Thread.sleep(1000);
		driver.close();
		
	}

}
