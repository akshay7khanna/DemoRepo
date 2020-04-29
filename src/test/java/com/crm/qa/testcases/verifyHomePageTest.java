package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class verifyHomePageTest extends TestBase {

	LoginPage login;
	HomePage home;
	public verifyHomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		login = new LoginPage();
		login.clickOnLoginBtnHome();
		String usr = prop.getProperty("username");
		String pass = prop.getProperty("password");
		home = login.login(usr, pass);
	}
	
	@Test(priority=1)
	public void verifyTitleTest() {
		String title = home.verifyHomePageTitle();
		
		Assert.assertEquals(title, "Cogmento CRM","homepage title not match");
	}
	@Test(priority=2)
	public void verifyUserNameLabel() {
		
		Assert.assertTrue(home.verifyuserlabel());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
