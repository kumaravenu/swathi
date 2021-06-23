package TestCases;

import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tc_collections3 {
	
	@Test(dataProvider="data")
	public void test_abc(String username,String password) {
		
			System.out.println("hi how are you " + username + "" +password);
			
		}

	@DataProvider(name="data")
	public String[][] data()
	{
		
		
		String[][] a= {{"username1","password1"},
				{"username1","password1"}};
		String[][] b= {{"a","b"}};
		 int c=1;
				 int d=2;
		if (c==d)
		{
		return (String[][]) a;
		}
		else
		{
			
			return (String[][]) a;
		}
				
	}

}
