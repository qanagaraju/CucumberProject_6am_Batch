package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import App_Elements.Amazon_Search_Products_Page_Elements;
import App_Utilities.BrowserFactory;
import App_Utilities.Property_Loader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_Products_Search {
		
		static WebDriver driver;
		static BrowserFactory browser = new BrowserFactory();
		static Property_Loader prop = new Property_Loader();
		static Amazon_Search_Products_Page_Elements searchElements;
	
	
		@Given("^user start browser$")
		public void user_start_browser() {
		   
			driver = browser.startBrowser(prop.getbrowsertype(), prop.getamazonurl());
			
		}
		
		
		@When("^user insert product details into search field$")
		public void user_insert_product_details_into_search_field() {
			searchElements=PageFactory.initElements(driver, Amazon_Search_Products_Page_Elements.class);
			searchElements.insert_Product_Details();
			
			
		}
		
		
		@Then("^user click search button$")
		public void user_click_search_button() {
			
		    
		}
		
		
		@Then("^user close browser$")
		public void user_close_browser() {
			
			driver.close();
		    
		}

	
	
	
}
