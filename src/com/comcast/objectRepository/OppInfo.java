package com.comcast.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OppInfo {
      @FindBy(xpath="//span[@class='dvHeaderText']")
      private WebElement oppnameDetail;

	public WebElement getOppnameDetail() {
		return oppnameDetail;
	}
      
      
}
