package org.Pomusingfind;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclasspom {
	
	public static WebDriver driver;
	public static WebDriver getdriver() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		return driver;
		
	}
	
	public static void loadurl(String data) {
		// TODO Auto-generated method stub
		driver.get(data);
	}
	
	public static void send(WebElement e1 , String data) {
		// TODO Auto-generated method stub
		e1.sendKeys(data);
	}
	public static void click(WebElement e2) {
		// TODO Auto-generated method stub
		e2.click();
		
	}

}
