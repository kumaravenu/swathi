package TestCases;

import java.io.File;
//import com.test.utilities.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
//import com.test.pageobjects.Base;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import com.test.pageobjects.mavenpo;

public class Readingdata  {
	
	
@Test(dataProvider="data")
public void withinUSA(HashMap<String,String> H)
{
	//System.out.println("Hi tis is my first testcase");
	System.out.println(H.get("From") + " " + H.get("To") );
}

@Test(dataProvider="data")
public void Abroad(HashMap<String,String> H)
{
	//System.out.println("Hi tis is my second testcase");
	System.out.println(H.get("From") + " " + H.get("To") );
}
@DataProvider(name="data")
public Object[][] readdata(Method M) throws IOException 
{
	FileInputStream f;
	XSSFWorkbook w;
	XSSFSheet s;
	String tcname=M.getName();
	//System.out.println(tcname);
	
	String fileName = "C:\\Vikash\\Testdata_1.xlsx";

	//Testcase_Runtype run= new Testcase_Runtype();

	f= new FileInputStream(fileName);
	
	w = new XSSFWorkbook(f);
	s= w.getSheet(tcname);
	int r=s.getLastRowNum();
	
	
	
	//System.out.println("my last row number in testdata " +r);
	Object[][] obj= new Object[r][1];
	HashMap<String,String> H= new HashMap<String,String>();
	if(1==0)
	{
	for (int i=0;i<r; i++)
	{
		
		for (int j=0;j<s.getRow(i).getLastCellNum();j++)
		{
			//System.out.println(s.getRow(0).getCell(j).getStringCellValue() + " " +s.getRow(i+1).getCell(j).getStringCellValue());
			H.put(s.getRow(0).getCell(j).getStringCellValue(),s.getRow(i+1).getCell(j).getStringCellValue());
			
			
		}
		obj[i][0]=H;
	}
	return obj;
	}
	else
	{
		Object[][] obj1= new Object[1][1];
		HashMap<String,String> H1= new HashMap<String,String>();
		 H1.put("from", "skipping testcase");
		 H1.put("To", "skipping testcase");
		 obj1[0][0]=H1;
		 return obj1;
		
		
	}


}

	



}
