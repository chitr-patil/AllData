package Sel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadExcelFile {

	// without opening chrome,read excel.
	public static void main(String[] args) throws Exception {
	
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		//Thread.sleep(5000);
//		driver.manage().window().maximize();
//		//Thread.sleep(2000);
//		driver.get("https://is.rediff.com/signup/register");
		
		FileInputStream file = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\SelProject\\TestData2\\Abhidnya's_Info.xlsx");
		 Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		/*String value1 = excel.getRow(0).getCell(0).getStringCellValue();
		String value2 = excel.getRow(0).getCell(1).getStringCellValue();
		String value3 = excel.getRow(0).getCell(2).getStringCellValue();
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
*/		
	//	driver.close();
		
		 // I am using here nested for loop cz two conditions are there.
		 for(int i=0;i<4;i++)
		 {
			 for(int j=0;j<4;j++)
			 {
				String v = excel.getRow(i).getCell(j).getStringCellValue();
				 //System.out.println(v);
				System.out.print(v+", ");
			 }
			 System.out.println( );
		 }
	}

}
