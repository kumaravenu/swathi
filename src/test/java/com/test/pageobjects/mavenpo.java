package com.test.pageobjects;

import org.openqa.selenium.By;
/*import org.openqa.selenium.By;*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class mavenpo {
	
public String fromcity="fromPort";
public String tocity="toPort";


WebDriver ldriver;

public mavenpo(WebDriver rdriver)
{
	ldriver=rdriver;
}

public void fromcitydata(String city)
{
	
	Select enterdata= new Select(ldriver.findElement(By.name(fromcity)));
	
	enterdata.selectByVisibleText(city);
	
}

public void tocitydata(String city)
{
	
	Select enterdata1= new Select(ldriver.findElement(By.name(tocity)));
	enterdata1.selectByVisibleText(city);
}
public void enterbutton()
{
	ldriver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
	System.out.println("clicked on button");
}

public String gettitle1()
{
	
	String a=ldriver.getTitle();
	return a;
	
}


}
