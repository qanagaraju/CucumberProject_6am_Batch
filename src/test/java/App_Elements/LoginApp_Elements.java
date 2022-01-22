package App_Elements;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginApp_Elements {
	
	static WebDriver driver;
	@FindBy(name="user")WebElement username;
	@FindBy(name = "pass")WebElement password;
	@FindBy(name = "btnSubmit")WebElement loginbutton;
	@FindBy(xpath = "//*[@id=\"user_bar\"]/ul/li[1]/a")private WebElement signout;
	@FindBy(id = "right_col_top_err")private WebElement user_message;
	
	public  LoginApp_Elements insert_username(String un) {
		
		if(username.isEnabled()) {
			username.sendKeys(un);
		}
		
		return this;
	}
	
	
	public LoginApp_Elements insert_password(String pw) {
		
		if(password.isEnabled()) {
			password.sendKeys(pw);
		}
		return this;
	}
	
	
	public LoginApp_Elements click_login() {
		
		
		
		
		if(loginbutton.isEnabled()) {
			loginbutton.click();
			
			try {
				
				String user_login_eror = user_message.getText();
				System.out.println(user_login_eror);
				
			}catch(NoSuchElementException e) {
				System.out.println(e.getMessage());
			}
			
			
		}
		return this;
	}
	
	
	public LoginApp_Elements click_logout() {
		
		try {
			
			if(signout.isEnabled()) {
				signout.click();
				System.out.println("Login Success");
			}
			
		}catch(NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		
		return this;
		
		
		
		
	}
	
	
	
}
