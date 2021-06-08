package TestCases;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class anv {
	
	
	@Test(dataProvider="data")
	public void test_abc(String username,String password) {
		
			System.out.println("hi how are you " + username + "" +password);
			
		}
	
	
		
		
	@DataProvider(name="data")
	public   Object[][] dataSupplier(Method method) throws IOException 
	{
		String Testname=method.getName();
		System.out.println("Hi "+ Testname);
		String[][] a=null;
		if(Testname=="test_abc")
		{
			 a=new String[][] {{"username1","password1"},{"username2","Password2"}};
			
		}
		else
		{
			System.out.println("error ");
		}

		return a;


}
}
