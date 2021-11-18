package Test.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Datadriven {
	

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis= new FileInputStream("./Data/demo.property");
        Properties p = new Properties();
        p.load(fis);
        String data = p.getProperty("url");
        System.out.println(data);
        
        String username = p.getProperty("username");
        System.out.println(username);
        
        
	}

}
 