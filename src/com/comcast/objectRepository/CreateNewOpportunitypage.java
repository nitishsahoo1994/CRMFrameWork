package com.comcast.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.comcast.genericLib.BaseClass;
import com.comcast.genericLib.WebDrivercommonUtils;

public class CreateNewOpportunitypage extends BaseClass {
   WebDrivercommonUtils wLib=new WebDrivercommonUtils();
      /*mandatory fields*/
  
	 @FindBy(name="potentialname")
	 private WebElement opportunityNameEdt;
	 
	 @FindBy(xpath="//input[@id='related_to_display']/following-sibling::img")
	 private WebElement clickOnAddorganisation;
	   
	 @FindBy(xpath="//input[@title='Save [Alt+S]']")
	 private WebElement clickSave;
	 
	 
	 /**/
	 @FindBy(xpath="//select[@name='opportunity_type']")
	 private WebElement typeDrop;
	 
	 @FindBy(xpath="//select[@name='leadsource']")
	 private WebElement leadSourceDrop;
	 
	 @FindBy(xpath="//input[@name='assigntype' and @value='T']")
	 private WebElement grpRadioBtn;
	 
	 @FindBy(xpath="//input[@name='amount']")
	 private WebElement amountEdt;
	 
	@FindBy(xpath="//select[@name='sales_stage']")
	private WebElement salesStagDrpDown;
	
	@FindBy(id="probability")
	private WebElement probabiliyEdt;
	
	@FindBy(name="description")
	private WebElement descriptionedt;
	
	public void desdescriptionBox(String description) {
		descriptionedt.sendKeys(description);
	}
	
	public void probabilityBox(String Probabilityvalue) {
		probabiliyEdt.sendKeys(Probabilityvalue);
	}
	
	public void selectSalesstage(String salesStage) {
		wLib.selectDropDown(salesStagDrpDown,salesStage);
	}
	 
	public void passAmount(String amount) {
		 amountEdt.sendKeys(amount);
		}
	 
	 
	 public void clickOnGrpRdo() {
		 grpRadioBtn.click();
	 }
	 
	
	 public void selectLeadSource(String leadSource) {
		wLib.selectDropDown(leadSourceDrop,leadSource);
	 }
	 
	  
	 public void selectType(String type) {
		 wLib.selectDropDown(typeDrop,type );
	 }
	 
	 
	 public WebElement getOpportunityNameEdt() {
		return opportunityNameEdt;
	}
	public void opportunityName(String oppName) {
		 opportunityNameEdt.sendKeys(oppName);
	 }
	 public void addOraganisationImg() {
		 clickOnAddorganisation.click();
		 
	 }
	 public void save() {
		 clickSave.click(); 
		 
	 }
	public WebElement getClickSave() {
		return clickSave;
	}
	 
}
