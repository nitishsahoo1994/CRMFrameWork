package wallehub;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	 
		@FindBy(name="em")
		private WebElement userNameEdt;
		
		@FindBy(name="pw")
		private WebElement passwordNameEdt;
		
		@FindBy(xpath = "//span[text()='Login']")
		private WebElement loginBtn;

		/*public WebElement getUserNameEdt() {
			return userNameEdt;
		}

		public WebElement getPasswordNameEdt() {
			return passwordNameEdt;
		}

		public WebElement getLoginBtn() {
			return loginBtn;
		}*/
		
		public void loginToApp(String userName,String password) {
			userNameEdt.sendKeys(userName);
			passwordNameEdt.sendKeys(password);
			loginBtn.click();
			

}
}