package com.comcast.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
 
	@FindBy(name="user_name")
	private WebElement userNameEdt;
	
	@FindBy(name="user_password")
	private WebElement passwordNameEdt;
	
	@FindBy(id="submitButton")
	private WebElement loginBtn;

	/*public WebElement getUserNameEdt() {
		return userNameEdt;
	}

	public WebElement getPasswordNameEdt() {
		return passwordNameEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}*/
	
	public void loginToApp(String userName,String password) {
		userNameEdt.sendKeys(userName);
		passwordNameEdt.sendKeys(password);
		loginBtn.click();
		
	}
	
}
