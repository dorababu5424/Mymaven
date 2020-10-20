package org.baseclass;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.ScreenshotException;

public class extendsclass extends Baseclassfram {
	public static void main(String[] args) throws IOException, AWTException {
		 WebDriver d = getdriver();
		 d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 weburl(exceldata(1, 0));
		 
		 maxwin();
		 
		 geturl();
		 
	
		
		WebElement user = d.findElement(By.id("username"));
		sendkey(user, exceldata(1,1));
		WebElement pas = d.findElement(By.id("password"));
		sendkey(pas, exceldata(1, 2));
		
		WebElement login = d.findElement(By.id("login"));
		click(login);
		
		WebElement loc = d.findElement(By.id("location"));
		select(loc, exceldata(1, 3));
		
		WebElement hostel = d.findElement(By.id("hotels"));
		select(hostel, exceldata(1, 4));
		
		WebElement rtye = d.findElement(By.id("room_type"));
		select(rtye, exceldata(1, 5));
		
		tabkey();
		
		WebElement cin = d.findElement(By.id("datepick_in"));
		sendkey(cin, exceldata(1, 7));
		
		
		WebElement cout = d.findElement(By.id("datepick_out"));
		sendkey(cout, exceldata(1, 8));
		
		tabkey();
		tabkey();
		tabkey();
		enterkey();
		
		WebElement radio = d.findElement(By.id("radiobutton_0"));
		click(radio);
		
		WebElement cont = d.findElement(By.id("continue"));
		click(cont);
		
		WebElement fn = d.findElement(By.id("first_name"));
		sendkey(fn, exceldata(4,0));
		
		WebElement fln = d.findElement(By.id("last_name"));
		sendkey(fln, exceldata(4, 1));
		
		WebElement add = d.findElement(By.id("address"));
		sendkey(add, exceldata(4, 2));
		WebElement cn = d.findElement(By.id("cc_num"));
		sendkey(cn, exceldata(8, 0));
		WebElement ct = d.findElement(By.id("cc_type"));
		select(ct, exceldata(8, 1));
		WebElement cm = d.findElement(By.id("cc_exp_month"));
		select(cm, exceldata(8, 2));
		WebElement cy = d.findElement(By.id("cc_exp_year"));
		select(cy, exceldata(8, 3));
		WebElement ccv = d.findElement(By.id("cc_cvv"));
		sendkey(ccv, exceldata(8, 4));
		
		tabkey();
		enterkey();
		
		excelwirte(11, 0, "YXVYU907");
		
		excelupdate(14, 0, "18000","19500");
		
		WebElement e2 = d.findElement(By.xpath("//input[@name='order_no']"));
		scrolldown(e2);
		scrnchot();
		excelwirte(11, 3, "C:\\Users\\DORABABU\\Pictures\\Screenshots\\out.png");
		
	}

}
