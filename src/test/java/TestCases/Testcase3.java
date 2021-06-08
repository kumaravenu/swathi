package TestCases;

import org.testng.annotations.Test;

public class Testcase3 {
	int a=10;
	int b=10;
	
	@Test
	public void Tc1_verify_add()
	{
		Test2 t= new Test2();
		
		int add=t.add(this.a, this.b);
		System.out.println(add);
	}
	@Test
	public void Tc2_verify_mul()
	{
		Test2 t= new Test2();
		int c=t.mul(this.a, this.b);
		System.out.println(c);
	}

}
