package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tc_collections {
	
	@Test(dataProvider="data")
	public void test_abc(String a) {
		
			System.out.println("hi how are you " + a);
			
		}
		
		
	@DataProvider(name="data")
	public String[] data()
	{
		String[] a= {"mum","lon","hyd"};
		return a;
	}
		
		
	
	
	

	
	
	

}
