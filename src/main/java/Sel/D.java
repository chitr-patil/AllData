package Sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.0");
		driver.get("https://www.facebook.com/");
	}

}
