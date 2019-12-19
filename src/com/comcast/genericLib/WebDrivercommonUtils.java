package com.comcast.genericLib;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDrivercommonUtils extends BaseClass  {
  public static String parentWindowId;
  public static String childWindowId;
	public void waitAndClickElementInGUI(WebElement element) throws InterruptedException {
		int count =0;
		while(count<20) {
			try {
				element.click();
				break;
			} catch (Exception e) {
				Thread.sleep(1000);
			}
		}
		
	}
	/**
	 * implicitly wait
	 */
  public void waitForPageToLoad() {
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
 }
 /**
  * explicitly  wait
  * @param element
  */
  public void waitForElementPresent(WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(element));
}
  
  /**
   * use for mousemovement operation
   * @param element
   */
  public void moveMouse(WebElement element) {
	  Actions act=new Actions(driver);
	  act.moveToElement(element).perform();
 }
  /**
   * handle dropdown and select option 
   * @param element
   * @param option
   */
  public void selectDropDown(WebElement element,String option) {
	Select sel=new Select(element);
	sel.selectByVisibleText(option);
	}
  public void getWindowsId() {
	 Set<String> set= driver.getWindowHandles();
	 
	  Iterator<String> itr=set.iterator();
	 parentWindowId=itr.next();
	 childWindowId=itr.next();
	 
  }
  
  
}
