package org.Pomusingfind;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample extends Baseclasspom {

	public static void main(String[] args) {
		
		WebDriver d = getdriver();
		
		loadurl("https://www.facebook.com/");
		
		d.manage().window().maximize();
		
		
			
		
		Pojopomfind p = new Pojopomfind();
		send(p.getTxtemail().get(0), "dorababu@gmail.com");
		send(p.getTxtpass().get(0),"Dora@1997");
		
		 d.navigate().refresh();
		 Pojopomfind p1 = new Pojopomfind();
			send(p1.getTxtemail().get(0), "dorababu@gmail.com");
			send(p1.getTxtpass().get(0),"Dora@1997");
			click(p1.getLogin()); 
		
	
		
		
		
		
		
		
	}
}
