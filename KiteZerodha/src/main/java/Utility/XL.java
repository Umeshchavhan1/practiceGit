package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XL {
	
    public static String getdata(String SheetName,int Row,int Cell) throws EncryptedDocumentException, IOException {
		
    	FileInputStream file=new FileInputStream("E:\\methods\\KiteZerodha\\src\\test\\resources\\BOOk5.xlsx");
    	String user= WorkbookFactory.create(file).getSheet(SheetName).getRow(Row).getCell(Cell).getStringCellValue();
    	
    	return user;
    	
		
	}

}
