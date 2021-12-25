package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class CancelPage extends Baseclass {

	
	public CancelPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="order_id_text")
	private WebElement searchBox;
	
	@FindBy(id="search_hotel_id")
	private WebElement go;
	
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement clickCancel;
	
	@FindBy(id="search_result_error")
	private WebElement message;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getGo() {
		return go;
	}

	public WebElement getClickCancel() {
		return clickCancel;
	}

	public WebElement getMessage() {
		return message;
	}
	
	
	public  void cancelOrderIdPage(String orderID) throws InterruptedException {
		
		sendkeys(getSearchBox(), orderID);
		click(getGo());
		Thread.sleep(5000);
		click(getClickCancel());
		simpleAlert();
	}
	
	public void verifyBooking(String expValue) {
		
		String text = getText(getMessage());
		 Assert.assertEquals("Verify the message booking", expValue, text);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
