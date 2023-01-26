package ActionClassProg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
// drag & drop 5000,Account,5000,Sales
public class Prog6 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");

		WebElement bankButton = driver.findElement(By.xpath("//li[@id=\"credit2\"]//a[@class='button button-orange']"));
		WebElement fiveThousandButton = driver.findElement(By.xpath("(//li[@id='fourth']//a[@class='button button-orange'])[1]"));
		WebElement salesButton = driver.findElement(By.xpath("//li[@id='credit1']//a[@class='button button-orange']"));                        // xpath 1 of 1 ananyasathi apn xpath chya left la parent ch element add krayche
		WebElement secFiveThousandButton = driver.findElement(By.xpath("(//li[@id=\"fourth\"]//a[@class=\"button button-orange\"])[2]"));

		WebElement dAccount = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));  // Xpath find by using text with normalize space method by google but still it 1 of 2 (its ok cz 1 of 2 means it shows 1st account & we also wants to find 1 account)so i'm adding her father there so it comes 1 of 1
		WebElement dAmount = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		WebElement cAccount = driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
		WebElement cAmount = driver.findElement(By.xpath("//ol[@id='amt8']"));

		Actions a=new Actions(driver);
		a.dragAndDrop(bankButton,dAccount).build().perform();
		Thread.sleep(5000);
		a.dragAndDrop(fiveThousandButton, dAmount).build().perform();
		Thread.sleep(5000);
		a.dragAndDrop(salesButton, cAccount).build().perform();
		Thread.sleep(5000);
		a.dragAndDrop(secFiveThousandButton, cAmount).build().perform();
		Thread.sleep(5000);
		
		driver.close();



	}

}
