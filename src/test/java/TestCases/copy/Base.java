package TestCases.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Base {
public static WebDriver driver;
public ExtentHtmlReporter htmlreports;
public ExtentReports Reports;
public ExtentTest test;
//public Screenshot

@BeforeClass 
public  void setup() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C://Vikash/eclipse/chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
	htmlreports= new ExtentHtmlReporter("C://Vikash//eclipse//myextent.html");
	htmlreports.config().setDocumentTitle("my first test Document");
	htmlreports.config().setReportName("my first test Report");
	htmlreports.config().setTheme(Theme.DARK);
	Reports= new ExtentReports();
	Reports.attachReporter(htmlreports);
	
	Reports.setSystemInfo("host", "localhost");
}

@AfterTest
public void teardown()
{
	
	Reports.flush();
}

@AfterClass
public void closebrowser()
{
	
	driver.close();
}

}
