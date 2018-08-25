package com.cbt.page;

import org.openqa.selenium.support.PageFactory;

import com.cbt.utils.Driver;

public class UserInfoPage {

	
	
	public UserInfoPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
}
