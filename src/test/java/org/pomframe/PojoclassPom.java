package org.pomframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoclassPom extends Baseclass {

	public PojoclassPom() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="email")
	private WebElement txtemail;
	
	@FindBy(id="pass")
	private WebElement txtpass;
	 
	public WebElement getTxtemail() {
		return txtemail;
	}

	public void setTxtemail(WebElement txtemail) {
		this.txtemail = txtemail;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public void setTxtpass(WebElement txtpass) {
		this.txtpass = txtpass;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}

	@FindBy(xpath="//button[@name ='login']")
	private WebElement login;
	}
