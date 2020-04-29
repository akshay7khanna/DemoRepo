package com.crm.qa.testcases;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class verifyLoginPageTest extends TestBase{

	LoginPage login;
	HomePage home;
	public verifyLoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		login = new LoginPage();
		home = new HomePage();
		
	}
	
	@Test
	public void verifyTitleTest() {
		login.clickOnLoginBtnHome();
		login.validateLoginPageTitle();
		String usr = prop.getProperty("username");
		String pass = prop.getProperty("password");
		home = login.login(usr, pass);
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
