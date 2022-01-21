package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import App_Utilities.BrowserFactory;
import App_Utilities.Property_Loader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_Products_Search {
		
		static WebDriver driver;
		static BrowserFactory browser = new BrowserFactory();
		static Property_Loader prop = new Property_Loader();
	
	
		@Given("^user start browser$")
		public void user_start_browser() {
		   
			driver = browser.startBrowser("chrome", "http://www.amazon.in");
			
		}
		
		
		@When("^user insert product details into search field$")
		public void user_insert_product_details_into_search_field() {
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung mobiles");
		   
		}
		
		
		@Then("^user click search button$")
		public void user_click_search_button() {
		    
		}
		
		
		@Then("^user close browser$")
		public void user_close_browser() {
		    
		}

	
	
	
}
