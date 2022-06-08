package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excl {
	public static String getdata(int row , int cell ,String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("D:\\Software testing\\selenium\\zerodha\\src\\test\\resources\\data.xlsx");
		
	String value=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	
	return value;
	}

}
