package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory or Object Repository
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//div[contains(@class,'submit button')]")
	WebElement loginbtn;
	
	@FindBy(xpath="//a[contains(.,'Sign Up')]")
	WebElement signupbtn;
	
	@FindBy(xpath="//span[contains(.,'Log In')]")
	WebElement loginbtnhome;
	
	//Initializing the page Object
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions or Methods
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public Boolean validateLoginBtn() {
		
		return loginbtn.isDisplayed();
		
	}
	
	public HomePage login(String username, String pass) {
		email.sendKeys(username);
		password.sendKeys(pass);
		loginbtn.click();
		
		return new HomePage();
	}
	
	public void clickOnLoginBtnHome() {
		
		loginbtnhome.click();
	}

}
