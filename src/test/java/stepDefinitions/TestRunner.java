package stepDefinitions;


import io.cucumber.testng.AbstractTestNGCucumberTests;



//@RunWith(Cucumber.class)
@io.cucumber.testng.CucumberOptions
(
		features = {"D:\\Selenium_Examples_New\\com.Cucucmber_Examples\\Features\\AmazonSearch.feature"},
		glue= {"stepDefinitions"},
		
		//plugin = { "pretty", "html:target/cucumber-reports" }
				//plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" }
				plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml","json:target/cucumber-reports/Cucumber.json"}
				
		
		
		)
		
		//to check the mapping is proper between feature file and step definition file
		
		

public class TestRunner extends AbstractTestNGCucumberTests{}