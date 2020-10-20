package org.pomframe;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.baseclass.Baseclassfram;
import org.driver.webdri;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.graph.ElementOrder.Type;

public class Sample extends Baseclass{

	
	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
	WebDriver	driver  = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		System.out.println("Lunch Bowser fb");
		
			// TODO Auto-generated method stub
			driver.findElement(By.id("username")).sendKeys("dorababu5424");
			driver.findElement(By.id("password")).sendKeys("Dora@1997");
			driver.findElement(By.id("login")).click();
			System.out.println("Test case 1 done");
		
	
			// TODO Auto-generated method stub
		
			WebElement loc = driver.findElement(By.id("location"));
			Select s = new  Select(loc);
			List<WebElement> options = s.getOptions();
			for (int i = 0; i <=options.size(); i++) {
				
				WebElement element = options.get(i);
				String text = element.getText();
				System.out.println(text);
				
				
				
			}
			
			String prid = driver.getWindowHandle();
			System.out.println(prid);
			
			Set<String> allwin = driver.getWindowHandles();
			List lii = new ArrayList();
			lii.addAll(allwin);
			String value = (String) lii.get(0);
			System.out.println(value);
			
		
		
		
		
		
		
		
		
	}

	
	

}
