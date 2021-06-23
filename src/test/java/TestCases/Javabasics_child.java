package TestCases;

public class Javabasics_child extends Javabasics{
	
	
	public void basics()
	{
		super.basics();
		int a=20;
		System.out.println("Parent class " + a +" " + this.a);
	}
	
	public static void main(String[] args)
	{
		
	Javabasics j= new Javabasics_child();
	j.basics();
	
	
	}

}
