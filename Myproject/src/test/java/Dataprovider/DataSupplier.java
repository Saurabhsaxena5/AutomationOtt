package Dataprovider;

import org.testng.annotations.DataProvider;

public class DataSupplier {
	
	@DataProvider
	public Object[] dp1() {
		Object[] data=new Object[]{
				
				"Saurabh",
				"Anil",
				"Kranti",
				
		};
		return data;

}
}