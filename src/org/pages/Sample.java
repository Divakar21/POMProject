package org.pages;

public class Sample extends BaseClass1{
	public static void main(String[] args) throws InterruptedException {
		getBrowser();
		loadUrl("https://adactin.com/HotelApp/");
		maximize();
		SearchPage page = new SearchPage();
		setText(page.getTxtUserName(),"Divakar23");
		setText(page.getTxtPassword(),"Fonature@123");
		btnClick(page.getButtonClick());
		selectByValue(page.getTxtLocation(),"Brisbane");
		selectByValue(page.getTxtHotels(),"Hotel Cornice");
		selectByValue(page.getTxtRoomType(),"Deluxe");
		selectByValue(page.getTxtRoomNos(),"3");
		setText(page.getTxtCheckInDate(),"08/10/2019");
		setText(page.getTxtCheckOutDate(),"12/10/2019");
		selectByValue(page.getTxtAdultsPerRoom(),"3");
		selectByValue(page.getTxtChildrensPerRoom(),"1");
		btnClick(page.getSearchClick());
		SelectHotel page1 = new SelectHotel();
		btnClick(page1.getSelectHotel());
		btnClick(page1.getContinueClick());
		BookHotel page2 = new BookHotel();
		setText(page2.getTxtFirstName(),"Divakar");
		setText(page2.getTxtLastName(),"Muthu");
		setText(page2.getTxtAddress(),"No 10, United Colony, Medavakkam, Chennai");
		setText(page2.getTxtCreditCardNo(),"4844532273665013");
		selectByValue(page2.getTxtCreditCardType(),"VISA");
		selectByValue(page2.getTxtExpiryMonth(),"9");
		selectByValue(page2.getTxtExpiryYear(),"2021");
		setText(page2.getTxtCvvNo(),"734");
		btnClick(page2.getBookNowClick());
		Thread.sleep(6000);
		getAttribute(page2.getTxtOrderNo(),"value");
		quitBrowser();
	}

}
