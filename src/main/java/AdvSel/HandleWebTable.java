package AdvSel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWebTable {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/index.html");
		
		List<WebElement> tableRows = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul"));
		
		for(int i=0;i<=tableRows.size()-1;i++)
			System.out.println(tableRows.get(i).getText());
		/*for(int i=0;i<=tableRows.size()-1;i++)
		{
			if(tableRows.get(i).equals("S&P BSE 200"))
			{
				tableRows.get(i).click();
				break;
			}
		}*/
		driver.close();
		
	}

}
