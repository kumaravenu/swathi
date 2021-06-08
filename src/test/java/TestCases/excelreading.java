package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class excelreading {
	
	@Test(dataProvider="data")
	public void testcase(HashMap<String,String> hm)
	{
		System.out.println(hm.get("username") + " " +hm.get("password"));

	}
	
	@DataProvider(name="data")
	public Object[][] dataSupplier() throws IOException {

	    File file = new File("C:\\Vikash\\TestData.xlsx");
	    FileInputStream fis = new FileInputStream(file);

	    XSSFWorkbook wb = new XSSFWorkbook(fis);
	    XSSFSheet sheet = wb.getSheetAt(1);
	    
	    int rowcount=sheet.getLastRowNum();
	    System.out.println("final count is " + rowcount);
        int rownumber=0;
        int rownumber1=0;
        String a;
       
        
       
	   for(int i=0;i<rowcount; i++) 
	   {
		   if(sheet.getRow(i)==null )
		   {
			   
			   continue;
		   }
		   else
		   {
		    a=sheet.getRow(i).getCell(0).toString();
		   
		   }
		   if (a.contentEquals("Testcase3"))
		   {
			   rownumber1=i;
		   }
   
	   }
	   
		   System.out.println("hiiii " +rownumber1);
		   
		   rownumber=rownumber1;
		   
		   HashMap<String,String> Hm;
		   Object ob[][]=new Object[rowcount][1];
	       while(rownumber<rowcount)
	       {

	    	   if(sheet.getRow(rownumber)!=null )
	    	   {
	    		   for(int j=0;j<sheet.getRow(rownumber).getLastCellNum();j++)
	    		   {
	    			    int rowr=rownumber1+2;
	    			    System.out.println("Testcase" +rowr);
	    			   Hm= new HashMap<String,String>();
	    		       Hm.put(sheet.getRow(rowr).getCell(j).getStringCellValue(),
	    		    		   sheet.getRow(rowr+1).getCell(j).getStringCellValue());
	    		       ob[rowcount][0]=Hm;
	    		   }
	    	
	       }
	    	   else
	    	   {
	    		   break;
	    		   
	    	   }
	    	   rownumber++;
	    	   
	       }
	       return  ob;
	}
}


	    


	        
 	            
	

	   

