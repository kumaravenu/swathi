package TestCases;

public class Privatecall {
	
	public static void main(String[] args)
	{
		Private p = new Private();
		p.getbalance("abhi");
		System.out.println(p.balance);
	}

}
