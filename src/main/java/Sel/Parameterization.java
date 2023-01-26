package Sel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization {

	public static void main(String[] args) throws Exception {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//Thread.sleep(5000);
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.get("https://is.rediff.com/signup/register");
		
		FileInputStream file = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\SelProject\\TestData\\TestData.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
		
		driver.close();
		
		
	}

}
