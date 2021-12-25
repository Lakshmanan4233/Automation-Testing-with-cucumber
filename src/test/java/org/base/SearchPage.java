package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class SearchPage extends Baseclass{
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "location")
	private WebElement dDnLocation;
	@FindBy(id = "hotels")
	private WebElement dDnHotels;
	@FindBy(id = "room_type")
	private WebElement dDnRoomType;
	@FindBy(id = "room_nos")
	private WebElement dDnNoOfRooms;
	@FindBy(id = "datepick_in")
	private WebElement txtCheckInDate;
	@FindBy(id = "datepick_out")
	private WebElement txtCheckOutDate;
	@FindBy(id = "adult_room")
	private WebElement dDnAdultsPerRoom;
	@FindBy(id = "child_room")
	private WebElement dDnChildPerRoom;
	@FindBy(id = "Submit")
	private WebElement btnSubmit;
	@FindBy(xpath="//span[@id='checkin_span']")
	private WebElement dateInMessage;
	@FindBy(xpath="//span[@id='checkout_span']")
	private WebElement dateOutMessage;
	@FindBy(id="location_span")
	private WebElement locationError;
	
	public WebElement getLocationError() {
		return locationError;
	}
	public WebElement getDateInMessage() {
		return dateInMessage;
	}
	public WebElement getDateOutMessage() {
		return dateOutMessage;
	}
	public WebElement getdDnLocation() {
		return dDnLocation;
	}
	public WebElement getdDnHotels() {
		return dDnHotels;
	}
	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}
	public WebElement getdDnNoOfRooms() {
		return dDnNoOfRooms;
	}
	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}
	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}
	public WebElement getdDnAdultsPerRoom() {
		return dDnAdultsPerRoom;
	}
	public WebElement getdDnChildPerRoom() {
		return dDnChildPerRoom;
	}
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
	

	
	public  void selectHotel(String location, String hotels, String roomType, String noOfRoom, String checkIn, String checkOut, String adultsRoom, String childRoom) {
		
		selectBytext(getdDnLocation(), location);
		selectBytext(getdDnHotels(), hotels);
		selectBytext(getdDnRoomType(), roomType);
		selectBytext(getdDnNoOfRooms(), noOfRoom);
		clear(getTxtCheckInDate());sendkeys(getTxtCheckInDate(), checkIn);
		clear(getTxtCheckOutDate());sendkeys(getTxtCheckOutDate(), checkOut);
		selectBytext(getdDnAdultsPerRoom(), adultsRoom);
		selectBytext(getdDnChildPerRoom(), childRoom);
		click(getBtnSubmit());
		
	}
	
	public void mandatoryFields(String location, String noOfRoom, String checkIn, String checkOut, String adultsPerRoom) {
		
		selectBytext(getdDnLocation(), location);
		selectBytext(getdDnNoOfRooms(), noOfRoom);
		clear(getTxtCheckInDate());sendkeys(getTxtCheckInDate(), checkIn);
		clear(getTxtCheckOutDate());sendkeys(getTxtCheckOutDate(), checkOut);
		selectBytext(getdDnAdultsPerRoom(), adultsPerRoom);
		click(getBtnSubmit());

	}
	
	
	public void unEvenDatesIn(String checkIn,String checkOut) {
		
		clear(getTxtCheckInDate());sendkeys(getTxtCheckInDate(), checkIn);
		clear(getTxtCheckOutDate());sendkeys(getTxtCheckOutDate(), checkOut);
		click(getBtnSubmit());
		
	}
	
	public  void verifyTheErrors(String expMessage1,String expMessage2) {
		
		String actMeDateIn = getText(getDateInMessage());
		String actMeDateOut = getText(getDateOutMessage());
		
		Assert.assertEquals("Verify the date In", expMessage1,actMeDateIn);
		Assert.assertEquals("Verify the date Out ", expMessage2,actMeDateOut);
		
	}
	
	public void withOutEnteringData() {
		
		click(getBtnSubmit());

	}
	
	public void locationError(String expMessage) {
		
		String actMessage = getText(getLocationError());
		Assert.assertEquals("Verify the error message", expMessage,actMessage);
		
		
		

	}

}
