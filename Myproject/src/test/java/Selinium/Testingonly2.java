package Selinium;

import org.testng.annotations.Test;

public class Testingonly2 {
	
	public class Testingonly {
		
		@Test(groups="functional")
		public void Test7()
		{
			System.out.println("Testing 1");
			
		}
		
		@Test(groups="sanity")
		public void Test8()
		{
			System.out.println("Testing 2");
			
		}
		
		@Test(groups="smoke")
		public void Test9()
		{
			System.out.println("Testing 9");
			
		}
		
		@Test(groups="sanity")
		public void Test10()
		{
			System.out.println("Testing 10");
			
		}
		
		@Test
		public void Test11()
		{
			System.out.println("Testing 11");
			
		}
		
		@Test
		public void Test12()
		{
			System.out.println("Testing 12");
			
		}

	}


}
