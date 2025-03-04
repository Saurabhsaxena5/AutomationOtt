package Dataprovider;

import org.testng.annotations.Test;

public class DataSupplier1 {
	
	@Test(dataProvider="dp1", dataProviderClass=DataSupplier.class)
	public void Testlogin(String s) {
		
		
		System.out.println(s);
	}
	
	

}
