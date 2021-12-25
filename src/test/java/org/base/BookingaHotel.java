package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class BookingaHotel extends Baseclass {
	
	public BookingaHotel() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastName;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement creditCard;
	
	@FindBy(id="cc_type")
	private WebElement selectCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement selectMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement selectYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvNumber;
	
	@FindBy(id="book_now")
	private WebElement bookNow;
	
	@FindBy(xpath="//td[@Class='login_title']")
	private WebElement bookingText;
	
	@FindBy(id="first_name_span")
	private WebElement firstNameError;
	
	
	@FindBy(id="last_name_span")
	private WebElement lastNameError;
	
	
	@FindBy(id="address_span")
	private WebElement addressError;
	
	
	@FindBy(id="cc_num_span")
	private WebElement cardNoError;
	
	
	@FindBy(id="cc_type_span")
	private WebElement cardTypeError;
	
	@FindBy(id="cc_expiry_span")
	private WebElement monthYearError;
	
	@FindBy(id="cc_cvv_span")
	private WebElement cvvNoError;

	
	public WebElement getFirstNameError() {
		return firstNameError;
	}
	public WebElement getLastNameError() {
		return lastNameError;
	}
	public WebElement getAddressError() {
		return addressError;
	}
	public WebElement getCardNoError() {
		return cardNoError;
	}
	public WebElement getCardTypeError() {
		return cardTypeError;
	}
	public WebElement getMonthYearError() {
		return monthYearError;
	}
	public WebElement getCvvNoError() {
		return cvvNoError;
	}
	public WebElement getBookingText() {
		return bookingText;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreditCard() {
		return creditCard;
	}
	public WebElement getSelectCardType() {
		return selectCardType;
	}
	public WebElement getSelectMonth() {
		return selectMonth;
	}
	public WebElement getSelectYear() {
		return selectYear;
	}
	public WebElement getCvvNumber() {
		return cvvNumber;
	}
	public void bookaHotel(String firstName,String lastName,String address,String cardNumber,String cvvNumber,String cardType,String month,String year) throws InterruptedException {
		
		sendkeys(getFirstName(), firstName);
		sendkeys(getLastName(), lastName);
		sendkeys(getAddress(), address);
		sendkeys(getCreditCard(), cardNumber);
		selectBytext(getSelectCardType(), cardType);
		selectBytext(getSelectMonth(), month);
		selectBytext(getSelectYear(), year);
		sendkeys(getCvvNumber(), cvvNumber);
		click(getBookNow());
		Thread.sleep(4000);

	}
	
	public void verifyTheMessage(String expMessage) {
		
		String actValue = getText(getBookingText());
		Assert.assertEquals("Verify the message", expMessage,actValue);
		
	}
	
	public void withoutEnter() {
		
		click(getBookNow());

	}
	
	
	public void verifyTheMessages(String enterName,String enterLastName,String enterAddress,String enterCardNo,String cardType,String monthYear,String cvvNo) {
		
		Assert.assertEquals("Verify the FirstName",  getText(getFirstNameError()),enterName);
		Assert.assertEquals("Verify the LastName",  getText(getLastNameError()),enterLastName);
		Assert.assertEquals("Verify the AddressName",  getText(getAddressError()),enterAddress);
		Assert.assertEquals("Verify the CardNo",  getText(getCardNoError()),enterCardNo);
		Assert.assertEquals("Verify the CardType",  getText(getCardTypeError()),cardType);
		Assert.assertEquals("Verify the MonthYear",  getText(getMonthYearError()),monthYear);
		Assert.assertEquals("Verify the CvvNo", getText(getCvvNoError()),cvvNo);

		
	}
	
	



}
