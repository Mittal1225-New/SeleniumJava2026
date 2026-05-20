package Framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	
	@Test
	public void operation() throws InterruptedException, IOException
	{

        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		 Thread.sleep(1000);
		 
		 POM s = new POM(driver);
		 
		 FileInputStream fso =  new FileInputStream("//Users//drmga//Desktop//TestData.xlsx");
		 XSSFWorkbook wbo  =  new XSSFWorkbook(fso);
		 XSSFSheet wso = wbo.getSheet("Sheet1");
		 Row r ; 
		 
		 r = wso.getRow(0);
		 
		 s.login(r.getCell(0).getStringCellValue(), r.getCell(1).getStringCellValue());
		 
		 
		 
		// s.login("admin", "admin123");
		 
		 
}
}


