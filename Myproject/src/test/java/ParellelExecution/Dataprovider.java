package ParellelExecution;

import org.testng.annotations.DataProvider;

public class Dataprovider {

	@DataProvider(name="login")
    public Object[][] getData() {
    		Object[][] data=new Object[][] {
            {"8920689888", "1234"},  // Test case 1
            {"9876543210", "4321"} ,
            
            {"Saurabh", "4321"} ,
            {"8920689888", "4321"}, 
            {"8920689888", "Saur"}
            };
            
           
            return  data;
        }
        
    }
