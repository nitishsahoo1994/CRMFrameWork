package com.comcast.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.comcast.genericLib.BaseClass;
import com.comcast.genericLib.WebDrivercommonUtils;

public class HomePage extends BaseClass {
	WebDrivercommonUtils wLib=PageFactory.initElements(driver, WebDrivercommonUtils.class);
@FindBy(linkText="Opportunities")
	private WebElement opportunitiesBtn;
	
	@FindBy(linkText="Leads")
	private WebElement leadBtn;
	
    @FindBy(xpath="//select[@id='qccombo']")
 	private WebElement selectDropDown; 
    
    @FindBy(xpath="//td[@class='genHeaderSmall']/following-sibling::td[1]/img")
    private WebElement adminImg;
    
    @FindBy(linkText="Sign Out")
    private WebElement signOutBtn;
	
	public WebElement getOpportunitiesBtn() {
		return opportunitiesBtn;
	}
	public void navigateToOpportunitiesPage() {
		opportunitiesBtn.click();
	}
	public void navigateToLeadsPage() {
		leadBtn.click();
	}
	 public void selectNewOrganisation() {
    	 Select sel=new Select(selectDropDown);
    	 sel.selectByVisibleText("New Organization");
     }
	public WebElement getSelectDropDown() {
		return selectDropDown;
	}
	public void logOut() throws InterruptedException {
		wLib.moveMouse(adminImg);
		wLib.waitAndClickElementInGUI(signOutBtn);
	}

	
	
	
	
	
	
}
