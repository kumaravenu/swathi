/*
 * package TestCases;
 * 
 * import java.io.File; import com.test.utilities.*; import
 * java.io.FileInputStream; import java.io.FileNotFoundException; import
 * java.io.FilterInputStream; import java.io.IOException; import
 * java.lang.reflect.Method; import java.util.HashMap; import
 * com.test.pageobjects.Base;
 * 
 * import org.apache.commons.io.FileUtils; import
 * org.apache.poi.xssf.usermodel.XSSFSheet; import
 * org.apache.poi.xssf.usermodel.XSSFWorkbook; import
 * org.openqa.selenium.OutputType; import org.openqa.selenium.TakesScreenshot;
 * import org.testng.annotations.DataProvider; import
 * org.testng.annotations.Test;
 * 
 * import com.test.pageobjects.mavenpo;
 * 
 * public class Readingdata1 extends Base {
 * 
 * 
 * @Test(dataProvider="data") public void withinUSA(HashMap<String,String> H)
 * throws IOException {
 * 
 * try { driver.get("https://blazedemo.com/index.php"); String
 * a=driver.getTitle();
 * 
 * mavenpo po= new mavenpo(driver); String b=po.gettitle1();
 * po.fromcitydata(H.get("From")); po.tocitydata(H.get("To")); po.enterbutton();
 * String c=po.gettitle1(); } catch(Exception e) { TakesScreenshot scrShot
 * =((TakesScreenshot)driver); File
 * SrcFile=scrShot.getScreenshotAs(OutputType.FILE); File DestFile=new
 * File("C://Vikash/H.get('From')+_H.get('To').png");
 * FileUtils.copyFile(SrcFile, DestFile);
 * 
 * }
 * 
 * }
 * 
 * 
 * 
 * 
 * @Test(dataProvider="data") public void data1(HashMap<String,String> H) {
 * 
 * System.out.println(H.get("From") + " " + H.get("To")); }
 * 
 * 
 * 
 * 
 * @DataProvider(name="data") public static Object[][] readdata(Method M) throws
 * IOException { FileInputStream f; XSSFWorkbook w; XSSFSheet s;
 * 
 * String fileName = "C:\\Vikash\\Testdata_1.xlsx";
 * 
 * String testcasename=M.getName();
 * 
 * Testcase_Runtype run= new Testcase_Runtype(); String
 * runmode=run.get_Testcase_Run(testcasename);
 * 
 * 
 * 
 * System.out.println("Hiiiii " +testcasename); System.out.println("Hi "
 * +runmode);
 * 
 * 
 * f= new FileInputStream(fileName);
 * 
 * w = new XSSFWorkbook(f); s= w.getSheet(testcasename); int
 * r=s.getLastRowNum();
 * 
 * System.out.println("my last row number in testdata " +r);
 * 
 * Object[][] obj= new Object[r][1] ; HashMap<String,String> H = null; for (int
 * i=0;i<r; i++) { if(runmode=="YES") System.out.println("hhhh"); H= new HashMap
 * <String,String>(); for (int j=0;j<s.getRow(i).getLastCellNum();j++) {
 * System.out.println(s.getRow(0).getCell(j).getStringCellValue() + " "
 * +s.getRow(i+1).getCell(j).getStringCellValue());
 * H.put(s.getRow(0).getCell(j).getStringCellValue(),
 * s.getRow(i+1).getCell(j).getStringCellValue());
 * 
 * } obj[i][0]=H; } return obj;
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * }
 */