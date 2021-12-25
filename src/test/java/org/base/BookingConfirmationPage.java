package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class  BookingConfirmationPage extends Baseclass {
	
	
	@FindBy(id="order_no")
	private WebElement orderID;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookedItinerary;

	public WebElement getOrderID() {
		return orderID;
	}

	public WebElement getBookedItinerary() {
		return bookedItinerary;
	}
	
	
	public String performance()  {
		
		
	    String attribute = getAttribute(getOrderID());
		click(getBookedItinerary());
		return attribute;
		
		
	

	}

}
