package Test.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class WriteExcel2 {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream("/home/deepak/Desktop/docs1/DataDrivenTesting/Data/system testing.xlsx");
		
		Workbook wb= WorkbookFactory.create(fis);
		int rescount =wb.getSheet("system testing").getLastRowNum();
		for(int i=0; i<rescount; i++ )
		{
			String un=wb.getSheet("system testing").getRow(i).getCell(0).getStringCellValue();
			String pwd=wb.getSheet("system testing").getRow(i).getCell(1).getStringCellValue();
			System.out.println(un+ " "+pwd);
		}
	}
}
		