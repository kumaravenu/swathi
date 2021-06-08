package com.test.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Base {
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
@AfterClass
public void closebrowser()
{
	
	driver.close();
}

}
