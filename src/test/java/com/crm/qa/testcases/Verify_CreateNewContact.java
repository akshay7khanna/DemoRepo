package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class Verify_CreateNewContact extends TestBase{

	LoginPage login;
	HomePage home;
	ContactsPage contact;
	String sheetName = "Contacts";
	public Verify_CreateNewContact() {
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
		contact = home.clickOnContactLink();
	}
	
	@DataProvider
	public Object[][] getCRMTestData() {
		Object[][] data = TestUtil.getTestData(sheetName);
		return data;	
	}
	
	@Test(dataProvider = "getCRMTestData")
	public void createNewAccount(String firstname, String lastname, String email) throws InterruptedException {
		
		contact.createNewContact(firstname,lastname, email);
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
}
