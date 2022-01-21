package App_Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class BrowserFactory 
{
	
	static WebDriver driver;
	
	public  WebDriver startBrowser(String browsertype,String appurl) {
		
		if(browsertype.equals("chrome")) {

			
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			
			//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver = new ChromeDriver(options);
			
		}else if(browsertype.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}else if(browsertype.equals("edge")) {

			WebDriverManager.edgedriver().setup();
			
			driver = new EdgeDriver();
		}
		
		
		
		driver.get(appurl);
		driver.manage().window().maximize();
		
		return driver;
		
		
	}
	
   
}
