package App_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property_Loader {
	
	public static Properties prop;
	
	
	public Property_Loader() {
		
	//Checked Exceptions
		
		File file = new File("./App_Files/login.properties");
		
		try {
			
		
		FileInputStream fis = new FileInputStream(file);
		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}finally {
			
			if(file.exists()) {
				System.out.println("Exception created");
				System.out.println("verified");
			}
			else
			{
				System.out.println("Does not created");
				System.out.println("not verified");
			}
		}

	
		
	}
	
	
	
	
	
	//create a methods for each property
	
	public String getbrowsertype() {
		return prop.getProperty("browsertype");
	}
	
	public String geturl() {
		
		return prop.getProperty("url");
		
	}
	
	public String getusername() {
		return prop.getProperty("username");
	}
	
	public String getpassword() {
		return prop.getProperty("password");
	}
	
	
	//Create methods for elements
	public String getunelement() {
		return prop.getProperty("unelement");
	}
	
	public String getpwelement(){
		return prop.getProperty("pwelement");
	
}
	
	public String getsubmit() {
		return prop.getProperty("submit");
	}
	
	
	
	
	public String getlogout() {
		return prop.getProperty("logout");
	}
	
	}
	
	
	
	
	
	
