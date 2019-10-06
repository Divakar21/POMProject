package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass1 {
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement txtLastName;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement txtAddress;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement txtCreditCardNo;
	
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement txtCreditCardType;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement txtExpiryMonth;
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement txtExpiryYear;
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement txtCvvNo;
	
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement bookNowClick;
	
	@FindBy(xpath="//input[@id='order_no']")
	private WebElement txtOrderNo; 

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCreditCardNo() {
		return txtCreditCardNo;
	}

	public WebElement getTxtCreditCardType() {
		return txtCreditCardType;
	}

	public WebElement getTxtExpiryMonth() {
		return txtExpiryMonth;
	}

	public WebElement getTxtExpiryYear() {
		return txtExpiryYear;
	}

	public WebElement getTxtCvvNo() {
		return txtCvvNo;
	}

	public WebElement getBookNowClick() {
		return bookNowClick;
	}
	public WebElement getTxtOrderNo () {
		return txtOrderNo;
	}
}
