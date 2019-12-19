package com.comcast.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.comcast.genericLib.WebDrivercommonUtils;

public class LookUpPage {
	WebDrivercommonUtils wLib=new WebDrivercommonUtils();
	
  @FindBy(id="search_txt")
  private WebElement searchEdit;
  
  @FindBy(name="search")
  private WebElement searchNowBtn;
  @FindBy(id="1")
  private WebElement cickonOrganisation;
  
  public void search(String organisanitinName) {
  searchEdit.sendKeys(organisanitinName);
  }
  
  public void searchNow() {
	  searchNowBtn.click();
  }
  public void oraganisationClick() {
	  cickonOrganisation.click();
  }
}
