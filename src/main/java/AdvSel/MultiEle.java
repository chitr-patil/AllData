package AdvSel;

import java.util.List;                                            // not run gives the error.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
                                         
public class MultiEle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("Total no of links="+links.size());
		 
		for(int i=0;i<=links.size();i++)
			System.out.println(links.get(i).getText());
		
		for(int i=0;i<=links.size();i++)          // we take here sec forloop cz we want to open the gmail link but it wont open via click
		{
			String expStr = "Gmail";
			String actStr = links.get(i).getText();     
			
			if(expStr.equals(actStr))
			{
				links.get(i).click();                   // so here i use that line
				break;                               // here break is imp cz when we click on gmail link we came into new page so if loop is continue that search again next
			}                                        // link which are present beside a gmail that is images so is not present on next page so it will gives us the error
		}                                            // that would be StaleElement Exception-means that perticular element is not present on current page.
	
	
	driver.close();
	}
		}