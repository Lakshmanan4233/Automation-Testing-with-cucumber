package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class SelectHotelPage extends Baseclass {
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "radiobutton_0")
	private WebElement SelectHotel;
	@FindBy(id = "continue")
	private WebElement btnConfirmHotel;
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement actMessage;
	
	public WebElement getSelectHotel() {
		return SelectHotel;
	}
	public WebElement getBtnConfirmHotel() {
		return btnConfirmHotel;
	}
	public WebElement getActMessage() {
		return actMessage;
	}
	
	
	public void selectPage() {
		click(getSelectHotel());
		click(getBtnConfirmHotel());

	}
	
	public void verifymessage(String expMessage) {
		
		String actMessage = getText(getActMessage());
		Assert.assertEquals("Verify the text", expMessage,actMessage);
		
	}
	

}
