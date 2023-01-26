package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadProg {

	public static void main(String[] args) throws Exception {
  
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement chooseFile = driver.findElement(By.xpath("//input[@type='file']"));
		Thread.sleep(2000);
		chooseFile.sendKeys("C:\\Users\\Dell\\Desktop\\photo1.png");  // normal desktop cha path dilyavr prog run hot nahi but c drive vrun path dilyavr run hoto.
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
