package Dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class practice1 {
	
	private static final String Dataprovider = null;
	@Test(dataProvider="dp2")
	public void Testlogin(String s) {
		
		System.out.println(s);
	}
		
	
	
	@DataProvider
	public String[] dp2() {
	String[] data=new String[] {
	"Data",
	"Saurabh",
	"Avan",
	
	};
	return data;
	}
	
	
	@Test(dataProvider="dp3")
	public void dp3(Integer s) {
		System.out.println(s);
	}
	
	@DataProvider
	public Integer[] dp3() {
		
		Integer[] data1=new Integer[] {
			
				2,
				3,
				4,
				
				
		};
		return data1;
		
	}
	
	//If we  pass both the string as well as integer so we can call the class object
	
	@Test(dataProvider="dp4")
	public void TestData5(String s) {
	
		
		System.out.println(s);
		
		
	
		
	}
	@DataProvider(indices= {0,2})
	public Object[] dp4(){
		
		Object[] data3=new Object[] {
			
				"SAURABH",
				"23453",
				
				"kunal"
		};
		return data3;
		
	}

	
}
