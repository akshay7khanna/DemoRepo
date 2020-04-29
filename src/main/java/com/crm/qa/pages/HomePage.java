package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	//Page Factory or Object Repository
	@FindBy(xpath="//div[@class='right menu']//span[contains(text(),'Akshay khanna')]")
	WebElement usernameLabel;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactLabel;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement dealsLabel;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement tasksLabel;
	
	
	
	//Initializing the page Object
		public HomePage() {
			
			PageFactory.initElements(driver, this);
		}
		
	//Actions and Methods
		public String verifyHomePageTitle() {
			
			return driver.getTitle();
		}
		
		public ContactsPage clickOnContactLink() {
			
			contactLabel.click();
			return new ContactsPage();
		}
		
		public DealsPage clcikOnDealsLink() {
			
			dealsLabel.click();
			return new DealsPage();
		}
		
		public TasksPage clcikOntasksLink() {
			
			dealsLabel.click();
			return new TasksPage();
		}
		
		public Boolean verifyuserlabel() {
			
			return usernameLabel.isDisplayed();
		}
}
