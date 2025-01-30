package Selinium;
import javax.swing.GroupLayout.Group;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class Testingonly {
	
	@Test(groups="sanity")
	public void Test1()
	{
		System.out.println("Testing 1");
		
	}
	
	@Test(groups="regression")
	public void Test2()
	{
		System.out.println("Testing 2");
		
	}
	@Test(groups="sanity")
	public void Test3()
	{
		System.out.println("Testing 3");
		
	}
	@Test(groups="functional")
	public void Test4()
	{
		System.out.println("Testing 4");
		
	}
	@Test(groups="sanity")
	
	public void Test5()
	{
		System.out.println("Testing 5");
		
	}
	
	@Test(groups="functional")
	public void Test6()
	{
		System.out.println("Testing 6");
		
	}

}
