package TestCases.copy;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;


public class test_1 extends Base {


@Test(groups= {"smoke","regression",})
public void invoke1()
{
	test=Reports.createTest("maven invoke1");
	driver.get("https://blazedemo.com/");
	test.log(Status.INFO, "one");
	test.log(Status.PASS, "able to invoke");
	
}

@Test(groups= {"regression",})
public void invoke2()
{
	try
	{
	test=Reports.createTest("maven invoke2");
	driver.get("https://blazedemo.com/");
	test.log(Status.INFO, "two");
	test.log(Status.FAIL, "able to invoke2");
	}
	catch(Exception e)
	{
		System.out.println("i got exception with " + e);
		
	}
	
	
}

@Test
public void invoke3()
{
	test=Reports.createTest("maven invoke3");
	driver.get("https://blazedemo.com/");
	test.log(Status.INFO, "three");
	test.log(Status.PASS, "able to invoke3");
	
}

}
