package org.Pomusingfind;

import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pojopomfind extends Baseclasspom {

	
	public Pojopomfind() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBys ({ //both should satificed
		@FindBy(xpath="//input[@id='email']"),@FindBy(xpath="//input[@name='email']")
	})
	 
	private java.util.List<WebElement> txtemail;
	//any one should satificed
	@FindAll({
		@FindBy(xpath="//input[@id='pass']"),
		@FindBy(xpath="//input[@name = 'password']")
		
	})
	private java.util.List<WebElement> txtpass;
	
	
	@FindBy (xpath="//button[@name='login']")
	private WebElement login;


	public java.util.List<WebElement> getTxtemail() {
		return txtemail;
	}


	public void setTxtemail(java.util.List<WebElement> txtemail) {
		this.txtemail = txtemail;
	}


	public java.util.List<WebElement> getTxtpass() {
		return txtpass;
	}


	public void setTxtpass(java.util.List<WebElement> txtpass) {
		this.txtpass = txtpass;
	}


	public WebElement getLogin() {
		return login;
	}


	public void setLogin(WebElement login) {
		this.login = login;
	}
	
	
	
	
	
}
