package Selinium;

import java.time.Duration;

import org.openqa.selenium.By;


public class Testing4 {
	
	public void setup()
	{
	try {
		System.out.println(5/0);
	}
	catch(Exception e)
	{
		System.out.println("This is infinity:"+e.getMessage());
	
	}
}
}

	

		