package Test.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
 
public class TestFile {
    public static void main(String[] args) throws FileNotFoundException {
        
       FileInputStream  file = new FileInputStream("./Data/Resume-Gunjan.docx/");
        
        Scanner scanner= new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        
    }
}