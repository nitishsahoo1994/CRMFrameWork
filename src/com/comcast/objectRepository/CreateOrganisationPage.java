package com.comcast.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateOrganisationPage {
   
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement organisationNamEdt;
	
	@FindBy(name="website")
	private WebElement websitenNamEdt;
	
	@FindBy(name="phone")
	private WebElement phoneNumberEdt;
	
	@FindBy(xpath="//table[@class='qcTransport']/tbody/tr[1]/td[1]/input")
	private WebElement saveBtn;
	
	public void organisationMandatoryField(String oraganisationName) {
		organisationNamEdt.sendKeys(oraganisationName);
	}
	public void organisationMandatoryField(String oraganisationName,long phoneNo,String website) {
		organisationNamEdt.sendKeys(oraganisationName);
		websitenNamEdt.sendKeys(website);
		//phoneNumberEdt.sendKeys(phoneNo);
	}
	public void clickSave() {
		saveBtn.click();
	}
	
	
	
}
