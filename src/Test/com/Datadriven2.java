package Test.com;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datadriven2 {

	public static void main(String[] args) throws IllegalStateException, IOException {
		
		 {
	}
		FileInputStream fis = new FileInputStream("./Data/Opportunity.xlsx");
		Workbook wb=  WorkbookFactory.create(fis);
		String value = wb.getSheet("Opportunity").getRow(7).getCell(2).getStringCellValue();
		System.out.println(value);
	}

}
