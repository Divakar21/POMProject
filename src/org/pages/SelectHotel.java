package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass1 {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id= 'radiobutton_0' ]")
	private WebElement selectHotel;
	
	@FindBy(xpath="//input[@id= 'continue' ]")
	private WebElement continueClick;

	public WebElement getSelectHotel() {
		return selectHotel;
	}
	
	public WebElement getContinueClick() {
		return continueClick;
	}

}
