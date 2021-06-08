package TestCases;

import org.testng.annotations.Test;

import com.test.pageobjects.Base;
import com.test.pageobjects.mavenpo;

public class testcase4 extends Base{



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




	
	

}
