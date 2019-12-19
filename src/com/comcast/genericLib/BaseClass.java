package com.comcast.genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.comcast.objectRepository.HomePage;
import com.comcast.objectRepository.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	public static FileLib fLib=new FileLib();

	@BeforeClass
	public void configBC() throws IOException {
		String browserName=fLib.getPropertyKeyValue("browser");
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
			}
		else if(browserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		String URL=fLib.getPropertyKeyValue("url");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(URL);
		
	}
	@BeforeMethod
	public void configBM() throws IOException {
		String USER=fLib.getPropertyKeyValue("user");
		String PASSWORD=fLib.getPropertyKeyValue("password");
		
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		lp.loginToApp(USER, PASSWORD);
	}
	@AfterMethod
	public void configAM() throws InterruptedException {
		
	  HomePage hp=PageFactory.initElements(driver, HomePage.class);
       hp.logOut();
	}
	
	
	

}
