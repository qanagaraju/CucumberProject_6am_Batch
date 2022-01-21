package stepDefinitions;


import io.cucumber.testng.AbstractTestNGCucumberTests;



//@RunWith(Cucumber.class)
@io.cucumber.testng.CucumberOptions
(
		features = {"D:\\Selenium_Examples_New\\com.Cucucmber_Examples\\Features\\LoginWindow.feature"},
		glue= {"stepDefinitions"},
		plugin = {"pretty"}
		
		
		)
		
		//to check the mapping is proper between feature file and step definition file
		
		

public class TestRunner extends AbstractTestNGCucumberTests{}