package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClass1 {
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='username']")
	private WebElement txtUserName;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement ButtonClick;
	
	@FindBy(xpath="//select[@id='location']")
	private WebElement txtLocation;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement txtHotels;
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement txtRoomType;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement txtRoomNos;
	
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement txtCheckInDate;
	
	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement txtCheckOutDate;
	
	@FindBy(xpath="//select[@id= 'adult_room' ]")
	private WebElement txtAdultsPerRoom;
	
	@FindBy(xpath="//select[@id= 'child_room' ]")
	private WebElement txtChildrensPerRoom;
	
	@FindBy(xpath="//input[@id= 'Submit' ]")
	private WebElement SearchClick;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getButtonClick() {
		return ButtonClick;
	}

	public WebElement getTxtLocation() {
		return txtLocation;
	}

	public WebElement getTxtHotels() {
		return txtHotels;
	}

	public WebElement getTxtRoomType() {
		return txtRoomType;
	}

	public WebElement getTxtRoomNos() {
		return txtRoomNos;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getTxtAdultsPerRoom() {
		return txtAdultsPerRoom;
	}

	public WebElement getTxtChildrensPerRoom() {
		return txtChildrensPerRoom;
	}

	public WebElement getSearchClick() {
		return SearchClick;
	}
	
}
