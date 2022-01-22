package App_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reader {
	
	//public  XSSFWorkbook wb;
	public static XSSFWorkbook wb ;
	public static XSSFSheet sheet;
	static XSSFCell cell;
	
	public Excel_Reader() {
		
			try {
			
			File file = new File("./App_Files/AmazonSearchProducts.xlsx");
			FileInputStream fis = new FileInputStream(file);
			
			wb = new XSSFWorkbook(fis);
			
								
		}catch(Exception f) {
			System.out.println(f.getMessage());
		}finally {
			
			System.out.println("Excel loaded successfully");
			
		}
		
		
		
	}
	
	//Create method to read data by excel table
	//Java OverLoading and Overriding 
	
	public String getcelldata(String sheetname,int rowno,int columnno) {
		
		return wb.getSheet(sheetname).getRow(rowno).getCell(columnno).getStringCellValue();
		
	}
	
	public String getcelldata(int sheetno,int rowno,int columno) {
		
		return wb.getSheetAt(sheetno).getRow(rowno).getCell(columno).getStringCellValue();
		
	}
	
	
	
	

}
