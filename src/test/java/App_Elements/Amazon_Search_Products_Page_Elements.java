package App_Elements;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import App_Utilities.Excel_Reader;


public class Amazon_Search_Products_Page_Elements {
	
	static WebDriver driver;
	static Excel_Reader excelReader = new Excel_Reader();
	
	@FindBy(id="twotabsearchtextbox")private WebElement searchElement;
	@FindBy(id="nav-search-submit-button")private WebElement ClickSearch;
	@FindBy(xpath="//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")
	private WebElement product_Details;
	
	
	public void insert_Product_Details() {
		
		XSSFSheet sheet = excelReader.wb.getSheetAt(0);
		int sheetRowsCount = sheet.getPhysicalNumberOfRows();
		
		for(int i=1;i<sheetRowsCount;i++) {
		
		String excel_data = excelReader.getcelldata(0, i, 0);
		
		searchElement.sendKeys(excel_data);
		
		if(ClickSearch.isEnabled()) {
			ClickSearch.click();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			String exp_product_details = product_Details.getText();
			String act_product_details = exp_product_details.replace("\"", "");
			
			try {
				
				Assert.assertEquals(excel_data, act_product_details);
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			
			searchElement.clear();
			
			
		}
		
	   
		}
	}
	
	
	public void click_Amazon_Search_Button() {
		
		
	
	}
	
	

}
