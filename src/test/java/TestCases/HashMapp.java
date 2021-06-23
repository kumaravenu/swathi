package TestCases;

import java.util.HashMap;

public class HashMapp {
	
	HashMap<String,String> H;
	String value;
	public String hashmapget(String key)
	{
		try
		{
			H= new HashMap<String,String>();
		     value=	H.get(key);
		}
		catch(Exception e)
		{
			System.out.println("did not find right key " +e);
		}
		return value;
	}

}
