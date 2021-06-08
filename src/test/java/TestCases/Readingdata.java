package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Readingdata {
	
	
@Test(dataProvider="data")
public void data(HashMap<String,String> H)
{
	System.out.println(H.get("username") + " " + H.get("password"));
}
	
@DataProvider(name="data")
public Object[][] readdata() throws IOException
{
	String fileName = "C:\\Vikash\\Testdata_1.xlsx";
	
	FileInputStream f= new FileInputStream(fileName);
	
	XSSFWorkbook w = new XSSFWorkbook(f);
	XSSFSheet s= w.getSheet("Sheet2");
	int r=s.getLastRowNum();
	
	System.out.println("my last row number is " +r);
	
	Object[][] obj= new Object[r][1] ;
	HashMap<String,String> H;
	for (int i=0;i<r; i++)
	{
		H= new HashMap <String,String>();
		for (int j=0;j<s.getRow(i).getLastCellNum();j++)
		{
			System.out.println(s.getRow(0).getCell(j).getStringCellValue() + " " +s.getRow(i+1).getCell(j).getStringCellValue());
			H.put(s.getRow(0).getCell(j).getStringCellValue(), s.getRow(i+1).getCell(j).getStringCellValue());
			
		}
		obj[i][0]=H;
	}
	return obj;

}

}
