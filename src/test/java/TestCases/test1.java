package TestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class test1 {
	
public ExtentHtmlReporter htmlreports;
public ExtentReports Reports;
public ExtentTest test;
public static WebDriver driver;

@BeforeTest
public void startreport()
{
	htmlreports= new ExtentHtmlReporter("C://Vikash/eclipse/abc.html");
	htmlreports.config().setDocumentTitle("my first test Document");
	htmlreports.config().setReportName("my first test Report");
	htmlreports.config().setTheme(Theme.DARK);
	
	
	Reports= new ExtentReports();
	Reports.attachReporter(htmlreports);
	
	Reports.setSystemInfo("host", "localhost");
	
}

@BeforeMethod
public void invokenrowser()

{
	System.setProperty("webdriver.chrome.driver", "C://Vikash/eclipse/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://mvnrepository.com");
	
}
@Test
public void invokebrowser()
{
	
	
	test=Reports.createTest("maven login1");
	
	
	
	String a=driver.getTitle();
	if(a.contains("Maven"))
	{
		/* Assert.assertTrue(true); */
	 test.log(Status.PASS, "test case passed");
	}
	else
	{
		/* Assert.assertTrue(false); */
		test.log(Status.FAIL, "test case Failed");
	}
	
}


@Test
public void invokebrowser1()
{
	
	
	test=Reports.createTest("maven login2");


	
	String a=driver.getTitle();
	if(a.contains("Maven"))
	{
		/* Assert.assertTrue(true); */
	 test.log(Status.PASS, "test case passed");
	}
	else
	{
		/* Assert.assertTrue(false); */
		test.log(Status.FAIL, "test case Failed");
	}
	
}
@Test
public void invokebrowser2()
{

	test=Reports.createTest("maven login 3");

	
	String a=driver.getTitle();
	if(a.contains("Maven"))
	{
		/* Assert.assertTrue(true); */
	 test.log(Status.PASS, "test case passed");
	}
	else
	{
		/* Assert.assertTrue(false); */
		test.log(Status.FAIL, "test case Failed");
	}
	
}

@AfterMethod
public void closebrowser()
{
	
	driver.close();
}

@AfterTest
public void teardown()
{
	
	Reports.flush();
}


}
