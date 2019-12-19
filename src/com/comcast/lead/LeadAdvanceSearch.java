package com.comcast.lead;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.comcast.genericLib.BaseClass;
import com.comcast.objectRepository.HomePage;
import com.comcast.objectRepository.LeadPage;

public class LeadAdvanceSearch extends BaseClass {
  
	@Test
  public void lastNameContainsSearch() {
		
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
          hp.navigateToLeadsPage();
          
          LeadPage lp=PageFactory.initElements(driver, LeadPage.class);
          lp.navigateToAdvanceLead();
	
	}
}
