package TestCases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

public class Collectionsbasics {
	
	@Test
	public void array()
	{
		int b=10;
		
	String[] a= {"mumbai","hyderabad","bangalore"};
	System.out.println("I am finding length of array here" +a.length +" " + b );
	
	for(int i=0;i<a.length;i++)
	{
	System.out.println(a[i]);
	}
	
	for(String c:a)
	{
		System.out.println("Hi i am using for each loop " +c);
	}
	
	}
	
	
	
	
	
	
	

}
