import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiWindowHandles {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://in.indeed.com/");
		
		driver.findElement(By.xpath("//a[@class=\"gnav-header-1lm88pq emf9s7v0\"]")).click();    // click on signin link.
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		getwindows();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		getwindows();
		Thread.sleep(2000);
		
		WebElement contWithFacebook = driver.findElement(By.xpath("//span[text()='Continue with Facebook']"));
		getwindows();
		Thread.sleep(2000);
		
		driver.close();
	}

	public static void getwindows() {
		Set<String> mainWindow = driver.getWindowHandles();
		System.out.println(mainWindow);
       
		
	}

}
