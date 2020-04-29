package com.crm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class ContactsPage extends TestBase {

	@FindBy(xpath="//button[contains(@class,'linkedin button') and contains(.,'New')]")
	WebElement newContactBtn;
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstNameTextBox;

	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastNameTextBox;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement emailTextBox;
	
	@FindBy(xpath="//button[contains(@class,'linkedin button') and contains(.,'Save')]")
	WebElement saveBtn;
	
	//Initializing the page Object
	public ContactsPage() {
				
		PageFactory.initElements(driver, this);
	}
	//Actions
	
	public void clickOnNew() throws InterruptedException {
		
		newContactBtn.click();
		Thread.sleep(7000);
	}
	
	public void createNewContact(String f_name, String l_name, String email ) throws InterruptedException {
		
		Thread.sleep(7000);
		newContactBtn.isDisplayed();
		newContactBtn.click();
		firstNameTextBox.isDisplayed();
		firstNameTextBox.sendKeys(f_name);
		lastNameTextBox.sendKeys(l_name);
		emailTextBox.sendKeys(email);
		saveBtn.click(); 
		
	}

			
}
