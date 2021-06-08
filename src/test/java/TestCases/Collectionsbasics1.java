package TestCases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Collectionsbasics1 {

public static void main(String[] args)
{
	Map<String,String> hm= new HashMap<String,String>();
	Collectionsbasics1 cc= new Collectionsbasics1();
	
	WebDriver driveww= new ChromeDriver();
	
	
	
	hm.put("city", "Hyd");
	hm.put("country", "ind");
	
	hm.get("city");
	
	System.out.println(hm.get("city"));
	
	for(String keysofhm : hm.keySet())
	{
		System.out.println(keysofhm + hm.get(keysofhm)  );
	}
	
}
	
	
	
	
	
	

}
