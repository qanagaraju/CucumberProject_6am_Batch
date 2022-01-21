package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import App_Elements.LoginApp_Elements;
import App_Utilities.BrowserFactory;
import App_Utilities.Property_Loader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest  {
	
	static WebDriver driver;
	
	static BrowserFactory browser = new BrowserFactory();
	static Property_Loader prop = new Property_Loader();
	static LoginApp_Elements loginpage ;
	
	
	@Given("^User start browser$")
	public void user_start_browser() {
		
		driver = browser.startBrowser(prop.getbrowsertype(), prop.geturl());
	
		
		
	}
	
	
	@When("^User insert valid username and password$")
	public void user_insert_valid_username_and_password() {
		loginpage=PageFactory.initElements(driver, LoginApp_Elements.class);
		loginpage.insert_username(prop.getusername());
		loginpage.insert_password(prop.getpassword());
		
		
	}
	
	
	@Then("^User click login button$")
	public void user_click_login_button() {
		loginpage=PageFactory.initElements(driver, LoginApp_Elements.class);
		loginpage.click_login();
		
	}
	
	
	@Then("^User click signout button$")
	public void user_click_signout_button() {
		
		try {
			
			loginpage=PageFactory.initElements(driver, LoginApp_Elements.class);
			loginpage.click_logout();
			System.out.println("login success");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
	}
	
	@Then("^User close browser$")
	public void user_close_browser() {
	    
		driver.close();
		
	}
	
	
	
}
