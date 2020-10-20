package org.pomframe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example {

	private static final boolean Dateuntil. = false;
	public static WebDriver driver;
	
	private WebDriver getdriver() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		return driver;
		
		
	}
	
	private void loadurl(String data) {
		// TODO Auto-generated method stub
	driver.get(data);
		
	}
	
	private void sendkeys(WebElement e2,String data) {
		// TODO Auto-generated method stub
		e2.sendKeys(data);
	}
	
	private void click(WebElement e1) {
		// TODO Auto-generated method stub
		e1.click();
	}
	
	private void select(WebElement e3,String data) {
		// TODO Auto-generated method stub
		Select s = new Select(e3);
		s.deselectByVisibleText(data);
	}
	
	private void exceldata(int r, int c , String data) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\DORABABU\\eclipse-workspace\\Myprojectmaven54\\files\\data3.xlsx");
		FileInputStream fil = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fil);
		
		Sheet sheet = w.getSheet("inputdata");
		Row row = sheet.getRow(r);
		Cell cell = row.getCell(c);
		int cellType = cell.getCellType();
		
		if (cellType ==1) {
			String value = cell.getStringCellValue();
		}
		else if (Dateuntil.isCellDateFormatted(c)) {
			
		}
		

	}
	
	
	
	
	
	
}
