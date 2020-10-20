package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclassfram {
	
	public static WebDriver driver;
	public static Actions a;
	public static WebDriver getdriver() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		 
		driver = new ChromeDriver();
		
		return driver;
	}
	
	public static  void weburl(String url) {
		// TODO Auto-generated method stub
		driver.get(url);
		
	
	}
	
	public static  void maxwin() {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
	}
	
	public static  void geturl() {
		// TODO Auto-generated method stub
		String curl = driver.getCurrentUrl();
		System.out.println(curl);
		String gettitle = driver.getTitle();
		System.out.println(gettitle);
	}
	
	public static  void sendkey(WebElement e1,String text) {
		// TODO Auto-generated method stub
		e1.sendKeys(text);
	}
	public static  void click(WebElement e1) {
		// TODO Auto-generated method stub
		e1.click();
	}

	public static void select(WebElement element,  String s1) {
		// TODO Auto-generated method stub
		Select s = new Select(element);
		s.selectByValue(s1);
		
	}
	
	public static void tabkey() throws AWTException {
		// TODO Auto-generated method stub
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);	
	}
	public static void enterkey() throws AWTException {
		// TODO Auto-generated method stub
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	///datasheet
	public static String exceldata(int row,int cell) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\DORABABU\\eclipse-workspace\\Myprojectmaven54\\files\\data2.xlsx");
		
		FileInputStream stream = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(stream);
		
		Sheet s = w.getSheet("data");
		
			Row row2 = s.getRow(row);
			Cell cell2 = row2.getCell(cell);
			int cellType = cell2.getCellType();
			String value = "";
			if(cellType==1) {
				 value = cell2.getStringCellValue();
				// System.out.println(value);
			}else if (DateUtil.isCellDateFormatted(cell2)) {
				Date d = cell2.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
				 value = sim.format(d);
				//System.out.println(value);
			}
			else {
				double d = cell2.getNumericCellValue();
				long l = (long) d;
				 value = String.valueOf(l);
				//System.out.println(value);
			}
			return value;
			
		}
	
	public static void excelwirte(int r, int c, String data1) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\DORABABU\\eclipse-workspace\\Myprojectmaven54\\files\\data2.xlsx");
		FileInputStream fil = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fil);
		Sheet sheet = w.getSheet("data");
		Row row = sheet.getRow(r);
		Cell cell = row.createCell(c);
		cell.setCellValue(data1);
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
	}
	
	public static void excelupdate(int r, int c, String original, String data) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\DORABABU\\eclipse-workspace\\Myprojectmaven54\\files\\data2.xlsx");
		FileInputStream fil = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fil);
		
		Sheet sh = w.getSheet("data");
		Row row = sh.getRow(r);
		Cell c1 = row.getCell(c);
		int cellType = c1.getCellType();
		String value = c1.getStringCellValue();
		if (value.equals(original)) {
			c1.setCellValue(data);	
		}
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
		
		

	}
	

		public static void scrolldown(WebElement e1) {
			// TODO Auto-generated method stub
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("arguments[0].scrollIntoView(true)", e1);
				}
		
		
		public static void scrnchot() throws IOException {
			// TODO Auto-generated method stub
			TakesScreenshot tk = (TakesScreenshot) driver;
			File s = tk.getScreenshotAs(OutputType.FILE);
			File d = new File("C:\\Users\\DORABABU\\Pictures\\Screenshots\\out.png");
			FileUtils.copyFile(s, d);
			
			
		}
		
		}
	
	
	
	

