package com.comcast.Opportunity;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.comcast.genericLib.BaseClass;
import com.comcast.genericLib.WebDrivercommonUtils;
import com.comcast.objectRepository.CreateNewOpportunitypage;
import com.comcast.objectRepository.HomePage;
import com.comcast.objectRepository.LookUpPage;
import com.comcast.objectRepository.OpportunitiesPage;
public class CreateOpportunitiesTest extends BaseClass {
/*  @Test
  public void createOpportunitiesWithMandatory() throws EncryptedDocumentException, IOException, InterruptedException {
	  //create new orga
	  HomePage hp=PageFactory.initElements(driver, HomePage.class);
	  hp.selectNewOrganisation();
	 
	  
	  //create organisation
	  String oraganisationName=fLib.getExcelData("Sheet1",1, 1);
	  CreateOrganisationPage cop=PageFactory.initElements(driver, CreateOrganisationPage.class);
	  cop.organisationMandatoryField(oraganisationName);
	   
	  
	  //click on save
	  cop.clickSave();
	  WebDrivercommonUtils wLib=new WebDrivercommonUtils();
	 wLib.waitAndClickElementInGUI(hp.getOpportunitiesBtn());
	  //click on Opportunities
	OrganisatonPage onp=PageFactory.initElements(driver, OrganisatonPage.class);
	onp.clickOnOpportunities();
	
	//create opportunity
	OpportunitiesPage orp=PageFactory.initElements(driver, OpportunitiesPage.class);
	orp.navigateToCreatingNewOpportunity();
	
	String oppName=fLib.getExcelData("Sheet1",1, 0);
	CreateNewOpportunitypage cno=PageFactory.initElements(driver, CreateNewOpportunitypage.class);
	cno.opportunityName(oppName);
	
	cno.addOraganisationImg();

	wLib.getWindowsId();
	 driver.switchTo().window(WebDrivercommonUtils.childWindowId);
	
	    LookUpPage sp=PageFactory.initElements(driver, LookUpPage.class);
	    sp.search(oraganisationName);
	    sp.searchNow();
	    sp.oraganisationClick();
	    driver.switchTo().window(WebDrivercommonUtils.parentWindowId);
	    wLib.waitForElementPresent(cno.getClickSave());
	cno.save();
	
	OppInfo oi=PageFactory.initElements(driver, OppInfo.class);
	String act=oi.getOppnameDetail().getText();
	boolean status=act.contains(oppName);
	Assert.assertTrue(status);
	
	}*/
  @Test
  public void createWithAllField() throws EncryptedDocumentException, IOException {
	   HomePage hp=PageFactory.initElements(driver, HomePage.class);
	   hp.navigateToOpportunitiesPage();
	   
	   OpportunitiesPage op=PageFactory.initElements(driver, OpportunitiesPage.class);
	   op.navigateToCreatingNewOpportunity();
	   
	   String oppname=fLib.getExcelData("Sheet1", 1, 1);
	   CreateNewOpportunitypage cno=PageFactory.initElements(driver, CreateNewOpportunitypage.class);
       cno.opportunityName(oppname);
       
       String type=fLib.getExcelData("Sheet1", 4, 3);
       cno.selectType(type);
       
       String leadSource=fLib.getExcelData("Sheet1", 4, 4);
       cno.selectLeadSource(leadSource);
		
       cno.clickOnGrpRdo();
        
       String amount=fLib.getExcelData("Sheet1", 4, 2);
       cno.passAmount(amount);
       
       String salesStage=fLib.getExcelData("Sheet1", 4, 5);
      cno.selectSalesstage(salesStage);
       
       String probability=fLib.getExcelData("Sheet1", 4, 6);
       cno.probabilityBox(probability);
       
       String description=fLib.getExcelData("Sheet1", 4, 7);
       cno.desdescriptionBox(description);
       
       cno.addOraganisationImg();
       
       WebDrivercommonUtils wLib=new WebDrivercommonUtils();
   	wLib.getWindowsId();
   	 driver.switchTo().window(WebDrivercommonUtils.childWindowId);
   	 LookUpPage lp=PageFactory.initElements(driver, LookUpPage.class);
   	 lp.oraganisationClick();
   
    driver.switchTo().window(WebDrivercommonUtils.parentWindowId);
     
       cno.save();
  }
  
}
