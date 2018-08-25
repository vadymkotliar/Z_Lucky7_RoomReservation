package com.cbt.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utils.BrowserUtils;
import com.cbt.utils.Driver;

public class LoginPage {

	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(name = "email")
	public WebElement emailBox;
	
	@FindBy(name = "password")
	public WebElement passwordBox;
	
	@FindBy(xpath = "//button[.='sign in']")
	public WebElement signinButton;

	@FindBy(xpath = "//a[.='my']")
	public WebElement myButton;

	@FindBy(xpath = "//a[.='self']")
	public WebElement selfButton;
	
	@FindBy(xpath = "//h2[@class='subtitle']") // user
	public WebElement title;

	@FindBy(xpath = "//a[.='sign out']")
	public WebElement signoutButton;
	
	
	  public void login(String email, String password ) {
		  emailBox.sendKeys(email);
		  passwordBox.sendKeys(password);
		  signinButton.click();
		  BrowserUtils.waitFor(5);
		  
	  }
	
}
