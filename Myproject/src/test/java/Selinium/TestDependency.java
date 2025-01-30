package Selinium;

import org.testng.annotations.Test;

public class TestDependency {
	String trackingNumber=null;
	//PNR NUMBER
	
	@Test()
	public void createshipment()
	{
		System.out.println(6/0);
		System.out.println("createshipment");
		trackingNumber="ABPL342";
		
	}
	
	
	
	@Test(dependsOnMethods= {"createshipment"})
	public void Trackshipment() throws Exception
	{
		System.out.println("createshipment");
		if(trackingNumber !=null)
		{
			System.out.println("Create shipment");
		}else
		{
			throw new Exception("invalid tracking number");
		}
		
	}
	
	@Test(dependsOnMethods= {"createshipment"})
	public void Cancelshipment() throws Exception
	{
		System.out.println("Cancelshipment ");
		if(trackingNumber !=null)
		{
			System.out.println("Cancel shipment");
		}else
		{
			throw new Exception("invalid tracking number");
		}
	}
	
	

	
	

}
