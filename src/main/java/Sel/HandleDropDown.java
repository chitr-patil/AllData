package Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

	public static void main(String[] args) throws Exception {
  
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://is.rediff.com/signup/register");
		WebElement newUserLable = driver.findElement(By.xpath("//b[text()='New User? Register here']"));
		WebElement day = driver.findElement(By.xpath("//select[@id='date_day']"));
		WebElement month = driver.findElement(By.xpath("//select[@id='date_mon']"));
		WebElement year = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		
	/*Select s1=new Select(day);
	s1.selectByIndex(7);
	Thread.sleep(2000);
	s1.selectByIndex(0);
		Thread.sleep(2000);
		s1.selectByValue("17");
		Thread.sleep(2000);
		s1.selectByVisibleText("23");
 
		List<WebElement> allDays = s1.getAllSelectedOptions();
		for(int i=1;i<32;i++)
			System.out.println(allDays.get(i).getText());
			System.out.println("--------");
			for(int i=1;i<allDays.size();i++)
			System.out.println(allDays.get(i).getText());
		Thread.sleep(5000);*/
		
		day.click();
		Select s1=new Select(day);
		s1.selectByVisibleText("17");
		
		month.click();
		Select s2=new Select(month);
		s2.selectByVisibleText("JAN");
		
		year.click();
		Select s3=new Select(year);
		s3.selectByVisibleText("1993");
		Thread.sleep(2000);
		
		driver.close();
	}

}
