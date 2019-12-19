package com.comcast.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpportunitiesPage {
     @FindBy(xpath="//img[@title='Create Opportunity...']")
     private WebElement createOpportunityBtn;
     
 
     
     public void navigateToCreatingNewOpportunity() {
    	 createOpportunityBtn.click();
    	 }
    
     
 }