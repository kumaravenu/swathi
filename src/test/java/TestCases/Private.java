package TestCases;

public class Private {
	
public	int balance=10000;
String key="abhi";

public void getbalance(String key)
{
	
	if (this.key.equals(key))
	{
	System.out.println(this.balance);
	}
	else
	{
		System.out.println("Its not the key buddy");
		
	}
	
}

}
