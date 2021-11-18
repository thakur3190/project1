package Test.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class WriteExcel1 {

	public static void main(String[] args) throws Exception {
		File f1= new File("/home/deepak/Desktop/docs1/DataDrivenTesting/Data/system testing.xlsx");
		
		FileInputStream fis = new FileInputStream(f1);
		
		Workbook wb= WorkbookFactory.create(fis);
		wb.getSheet("createcustomer").getRow(1).getCell(1).setCellValue("true");
		FileOutputStream fes=new FileOutputStream("./Data/system testing.xlsx");
		wb.write(fes);
		wb.close();
		
	}
}
		