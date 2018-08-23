package com.cbt.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbt.utils.Driver;

//import lightside.utilities.Driver;


public class MapPage {

	
	public MapPage() {
		PageFactory.initElements(Driver.getDriver(), this);
}


	@FindBy(linkText = "map")
	public WebElement map;

	@FindBy(linkText = "schedule")
	public WebElement schedule;

	@FindBy(linkText = "hunt")
	public WebElement hunt;
	
	@FindBy(xpath = "//h1[@class='title']")
	public WebElement VA;

	@FindBy(xpath = "//h2[@class='subtitle']")
	public WebElement lightside;

	@FindBy(id = "111")
	public WebElement classroom1;

	@FindBy(id = "112")
	public WebElement classroom2;

	@FindBy(id = "113")
	public WebElement classroom3;
	
	@FindBy(id = "kitchen-va-light-side")
	public WebElement kitchen;

	@FindBy(id = "lobby-va-light-side")
	public WebElement lobby;
	
	@FindBy(id = "room-111")
	public WebElement mit;
	
	@FindBy(id = "room-112")
	public WebElement harvard;
	
	@FindBy(id = "room-113")
	public WebElement yale;
	
	@FindBy(id = "room-114")
	public WebElement princeton;
	
	@FindBy(id = "room-115")
	public WebElement stanford;
	
	@FindBy(id = "room-116")
	public WebElement duke;
	
	@FindBy(id = "room-117")
	public WebElement berkley;
	
	@FindBy(id = "wellness-room-111")
	public WebElement wellness111;
	
	@FindBy(id = "wellness-room-112")
	public WebElement wellness112;



}

	
	
	

