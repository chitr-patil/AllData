package Sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog2 {

	public static void main(String[] args) throws Exception {
   
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://is.rediff.com/signup/register");
        Thread.sleep(2000);
        String expTitle = "Rediff.com";
        String actTitle = driver.getTitle();
        if(actTitle.equals(expTitle))
        {
        	System.out.println("Title-Test case is pass");
        }
        else
        {
        	System.out.println("Title-Test case is fail");
        }
        System.out.println("Actual Title="+actTitle);
        String currUrl = driver.getCurrentUrl();
        System.out.println("Current Url="+currUrl);
        driver.close();
        
	}
	

}
