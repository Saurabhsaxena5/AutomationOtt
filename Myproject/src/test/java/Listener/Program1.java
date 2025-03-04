package Listener;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listner.class)
public class Program1 {
	
	private static final String dependOnmethods = null;

	@Test(priority=1)
	public void Test1() {
		System.out.println("This is the first method");
	}
	@Test(priority=2)
	public void Test2() {
		System.out.println("This is the second method");
	}
	@Test(priority=3)
	public void Test3() {
		System.out.println("This is the Third method");
	}
	
	@Test
	public void Test4() {
		System.out.println("This is pass test case");
		
		
	}
	
	@Test(priority=5)
	public void Test5() {
		System.out.println("This is the Fifth method");
	}
	
	@Test(priority=6)
	public void Test6() {
		System.out.println("This is the sixth method");
	}

}
