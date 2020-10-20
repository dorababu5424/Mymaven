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

public class Baseclass {
	
	public static WebDriver driver;
	
	public static WebDriver getdriver() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		 
		driver = new ChromeDriver();
		
		return driver;
	}
	
	
	
	public static  void geturl(String url) {
		// TODO Auto-generated method stub
		driver.get(url);
	}

	public static void sendkey(WebElement e1,String data) {
		// TODO Auto-generated method stub
		e1.sendKeys(data);
		
	}
	public static void login22(WebElement e2) {
		// TODO Auto-generated method stub
		e2.click();
	}
	
	public static void excelcreate(int r ,int c,String data) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\DORABABU\\eclipse-workspace\\Myprojectmaven54\\files\\fbdata.xlsx");
		
		Workbook w = new XSSFWorkbook();
		
		Sheet csh = w.createSheet("inputdata");
		Row createRow = csh.createRow(r);
		Cell createCell = createRow.createCell(c);
		createCell.setCellValue(data);
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);}
	
	public static void excelwirte(int r ,int c,String data) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\DORABABU\\eclipse-workspace\\Myprojectmaven54\\files\\fbdata.xlsx");
		FileInputStream fil = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fil);
		
		Sheet csh = w.getSheet("inputdata");
		Row createRow = csh.getRow(r)
		Cell createCell = createRow.getCell(c)
		int cellType = createCell.getCellType();
		if (cellType == null) {
			
		}
		
		createCell.setCellValue(data);
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
	}
	
	
	
	
	
}
