package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.pageobjects.mavenpo;

public class completedata {
	
	
	public static WebDriver driver;
	/*
	 * public String baseurl=
	 * "https://mvnrepository.com/artifact/com.aventstack/extentreports/5.0.8";
	 */

	@BeforeClass 
	public  void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://Vikash/eclipse/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
	}
	
	
	
	
	@Test
	public void test1() throws InterruptedException
	{
		/* Base b= new Base(); */
		/* driver=b.setup(); */
		driver.get("https://blazedemo.com");
	    String a=driver.getTitle();
	    
	    mavenpo po= new mavenpo(driver);
	    String b=po.gettitle1();
	   po.fromcitydata("Boston");
	   po.tocitydata("London");
	   po.enterbutton();
	   String c=po.gettitle1();
	    System.out.println(b);
	    System.out.println(c);

		
	}
	@AfterClass
	public void closebrowser()
	{
		
		driver.close();
	}	

}
