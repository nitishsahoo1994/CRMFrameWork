package com.comcast.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganisatonPage {
    
	@FindBy(linkText="Opportunities")
	private WebElement opportunitiesBtn;
	
	public void clickOnOpportunities() {
		opportunitiesBtn.click();
	}
	
}
