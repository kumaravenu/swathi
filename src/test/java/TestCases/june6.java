package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class june6 {

@Test(dataProvider="data",priority=0)
public void multi(String country,String State,String city)
{
	
	System.out.println(country + " "+ State + " " + city);
}

@Test(dataProvider="data1",priority=1)
public void multi1(String country,String State,String city)
{
	
	System.out.println(country + " "+ State + " " + city);
}

@DataProvider(name="data")
public String[][] data()
{
	String[][] a= {{"india","karnataka","bangalore",},
			        {"Aus","aus","melborne"}};
	
	return a;
}

@DataProvider(name="data1")
public String[][] data_1()
{
	String[][] a= {{"india","karnataka","bangalore"},
			        {"Aus","syd","county"}};
	
	return a;
}



}
