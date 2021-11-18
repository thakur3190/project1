package Test.com;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {

	public static void main(String[] args) throws Exception {
	
		
		FileInputStream fis = new FileInputStream("./Data/Opportunity.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		 Sheet data = wb.getSheetAt(0);
		
		 
		 
		 System.out.println("Data from Opportunity sheet 1st row :::: "+data);
		 
		 int count= data.getLastRowNum();
		 System.out.println("Total row is ::::"+count);
		 for (int i=1 ; i<4; i++)
		 {
			 String data1= data.getRow(i).getCell(1).getStringCellValue();
			 System.out.println("Data from Row " +i+ "  is "+data1 );
		 }
		
		
		

	}

}
