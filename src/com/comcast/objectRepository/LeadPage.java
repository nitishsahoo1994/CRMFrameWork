package com.comcast.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadPage {
  
	
	@FindBy(linkText="Go to Advanced Search")
	private WebElement advanceSearchClk;
	
	public void navigateToAdvanceLead() {
		advanceSearchClk.click();
	}
}
