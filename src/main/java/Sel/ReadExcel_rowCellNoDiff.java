package Sel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel_rowCellNoDiff {

	public static void main(String[] args) throws Exception  {
  
		FileInputStream file=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\SelProject\\TestData2\\Abhidnya's_Info.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet2");
		
		for(int row=0;row<=excel.getLastRowNum();row++)
		{
			for(int col=0;col<excel.getRow(row).getLastCellNum();col++)
			{
				String value = excel.getRow(row).getCell(col).getStringCellValue();
				System.out.println(value+" ");
			}
			System.out.println();
		}
	}

}
