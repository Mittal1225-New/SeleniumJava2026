package Framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		
		
		 FileInputStream fso =  new FileInputStream("//Users//drmga//Desktop//TestData.xlsx");
		 XSSFWorkbook wbo  =  new XSSFWorkbook(fso);
		 XSSFSheet wso = wbo.getSheet("Sheet2");
		 Row r ;   //Row is  a class
		
		/* r = wso.getRow(1);
		 
		String value = r.getCell(0).getStringCellValue();
		System.out.println(value);
		
		*/
		 
	     r = wso.createRow(2);
		 
		 r.createCell(0).setCellValue("Vamsi");
		 
		 FileOutputStream fo = new FileOutputStream ("//Users//drmga//Desktop//TestData.xlsx");
		 wbo.write(fo);
}

	}




