package com.stepDefn;

import java.util.List;
import java.util.Map;

import org.base.Baseclass;
import org.base.BookingConfirmationPage;
import org.base.BookingaHotel;
import org.base.CancelPage;
import org.base.LoginPag;
import org.base.SearchPage;
import org.base.SelectHotelPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Step extends Baseclass {

	
	@Given("User should on adactinhotel page")
	public void user_should_on_adactinhotel_page() {
	   
		getDriver();
		implicitywaits(20);
		getUrl("http://adactinhotelapp.com/");
		
	}

	@When("User should login {string},{string}and login")
	public void user_should_login_and_login(String string, String string2) {
		
		LoginPag loginPag = new LoginPag();
		loginPag.Loginhotel(string, string2);
	   
	}

	@When("User should select {string},{string},{string},{string},{string},{string},{string},{string} and search")
	public void user_should_select_and_search(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	   SearchPage page = new SearchPage();
	   page.selectHotel(string, string2, string3, string4, string5, string6, string7, string8);
	}

	@Then("Verify  navigate to {string}  message on the page")
	public void verify_navigate_to_message_on_the_page(String string) {
		
		SelectHotelPage hotelPage = new SelectHotelPage();
		hotelPage.verifymessage(string);
	    
	}

	@When("User should select mandatory fields {string},{string},{string},{string},{string} and search")
	public void user_should_select_mandatory_fields_and_search(String string, String string2, String string3, String string4, String string5) {
	   
		SearchPage mandatory = new SearchPage();
		mandatory.mandatoryFields(string, string2, string3, string4, string5);
	}

	@Then("Verify  navigate to {string}  page")
	public void verify_navigate_to_page(String string) {
		SelectHotelPage manFields = new SelectHotelPage();
		manFields.verifymessage(string);
	    
	}
	
	@When("User should enter uneven dates {string},{string} and search")
	public void user_should_enter_uneven_dates_and_search(String string, String string2) {
	  
		SearchPage unEven = new SearchPage();
		unEven.unEvenDatesIn(string, string2);
		
	}

	@Then("Verify the error messsages {string} and {string}")
	public void verify_the_error_messsages_and(String string, String string2) {
	   
		SearchPage errorDate = new SearchPage();
		errorDate.verifyTheErrors(string, string2);
	}
	
	@When("User without entering data and search")
	public void user_without_entering_data_and_search() {
	    
		SearchPage withoutEnter = new SearchPage();
		withoutEnter.withOutEnteringData();
	}

	@Then("Verify the {string} message got successful")
	public void verify_the_message_got_successful(String string) {
		
		SearchPage locationError = new SearchPage();
		locationError.locationError(string);
	}

	@When("Go to the select hotel page {string},{string},{string},{string},{string},{string},{string},{string}search the hotel for the information")
	public void go_to_the_select_hotel_page_search_the_hotel_for_the_information(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		SearchPage booking = new SearchPage();
		booking.selectHotel(string, string2, string3, string4, string5, string6, string7, string8);
		
	}

	@When("Select the one hotel and continue")
	public void select_the_one_hotel_and_continue() {
		SelectHotelPage clickHotel = new SelectHotelPage();
		clickHotel.selectPage();
	    
	}

	@When("Give the details {string},{string},{string},{string},{string} and Book Now")
	public void give_the_details_and_Book_Now(String string, String string2, String string3, String string4, String string5, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	   
		List<Map<String, String>> maps = dataTable.asMaps();
		Map<String, String> map = maps.get(0);
		String string6 = map.get("cardType");
		String string7 = map.get("month");
		String string8 = map.get("year");
		
		BookingaHotel info = new BookingaHotel();
		info.bookaHotel(string, string2, string3, string4, string5, string6, string7, string8);
		
	}

	@Then("Verify the {string} message get sucessfull")
	public void verify_the_message_get_sucessfull(String string) {
		
		BookingaHotel verifyBooking = new BookingaHotel();
		verifyBooking.verifyTheMessage(string);
	   
	}
	
	
	@When("Book a hotel without entering deatils")
	public void book_a_hotel_without_entering_deatils() {
	    
		BookingaHotel withoutEnter = new BookingaHotel();
		withoutEnter.withoutEnter();
		
	}

	@Then("Verify the {string},{string},{string},{string},{string},{string}and {string}")
	public void verify_the_and(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	   
		BookingaHotel verify = new BookingaHotel();
		verify.verifyTheMessages(string, string2, string3, string4, string5, string6, string7);
		
	}
	
	
	@When("User Go to the select hotel page {string},{string},{string},{string},{string},{string},{string},{string}search the hotel for the information")
	public void user_Go_to_the_select_hotel_page_search_the_hotel_for_the_information(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	    
		SearchPage search = new SearchPage();
		search.selectHotel(string, string2, string3, string4, string5, string6, string7, string8);
	}

	@When("User Select the one hotel and continue")
	public void user_Select_the_one_hotel_and_continue() {
		SelectHotelPage continues = new SelectHotelPage();
		continues.selectPage();
	   
	}

	@When("User Give the details {string},{string},{string},{string},{string} and Book Now")
	public void user_Give_the_details_and_Book_Now(String string, String string2, String string3, String string4, String string5, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    
		List<Map<String, String>> maps = dataTable.asMaps();
		Map<String, String> map = maps.get(2);
		String string6 = map.get("cardType");
		String string7 = map.get("month");
		String string8 = map.get("year");
		
		BookingaHotel info = new BookingaHotel();
		info.bookaHotel(string, string2, string3, string4, string5, string6, string7, string8);
	}

	@When("User is go to the booked itinerary page from booking confirmation page")
	public void  user_is_go_to_the_booked_itinerary_page_from_booking_confirmation_page() throws InterruptedException   {
		
		
		BookingConfirmationPage orderGet = new BookingConfirmationPage();
	    String performance = orderGet.performance();
	    
	    CancelPage cancel = new CancelPage();
	    cancel.cancelOrderIdPage(performance);
	    
		
	}

	@Then("Cancel the order ID and verify the {string} message got sucessful")
	public  void cancel_the_order_ID_and_verify_the_message_got_sucessful(String string) throws InterruptedException {
		
		CancelPage verify = new CancelPage();
		verify.verifyBooking(string);
		
		
		
		
	
	}



	
	
}
