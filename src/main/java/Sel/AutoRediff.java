package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
                                    // here we learn how to get the text of webpage.
public class AutoRediff {

	public static void main(String[] args) throws Exception {
  
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://is.rediff.com/signup/register");
		
		WebElement newUserLable = driver.findElement(By.xpath("//div[@id='div_register']"));
		WebElement tellUsLable = driver.findElement(By.xpath("//p[@class='grey1']"));
		
		/*String str1 = newUserLable.getText();
		System.out.println(str1);
		String str2 = tellUsLable.getText();
		System.out.println(str2);
		*/
		
		System.out.println("Lable 1="+newUserLable.getText());
		System.out.println("Lable 2="+tellUsLable.getText());
		
				driver.close();
		
	
	}

}
