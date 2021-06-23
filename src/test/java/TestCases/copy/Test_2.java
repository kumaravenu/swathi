package TestCases.copy;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.test.pageobjects.Base;

public class Test_2 extends Base{

	@Test
	public void invoke4()
	{

		driver.get("https://blazedemo.com/");
		test.log(Status.PASS, "able to invoke4");
		
	}

	public void invoke5()
	{

		driver.get("https://blazedemo.com/");
		test.log(Status.PASS, "able to invoke5");
		
	}

	public void invoke6()
	{

		driver.get("https://blazedemo.com/");
		test.log(Status.PASS, "able to invoke6");
		
	}

}
