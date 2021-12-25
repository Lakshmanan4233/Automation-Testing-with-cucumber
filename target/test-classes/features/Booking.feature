@BookingPage
Feature: Verify the booking confirmation

  @Bookingsucessfull
  Scenario Outline: Verifying the AdactinHotel booking successfull
    Given User should on adactinhotel page
    When User should login "<userName>","<password>"and login
    When Go to the select hotel page "<location>","<hotel>","<roomType>","<noOfRoom>","<checkInDate>","<checkOutDate>","<adultsPerRoom>","<childPerRomm>"search the hotel for the information
    When Select the one hotel and continue
    When Give the details "<firstName>","<lastName>","<address>","<creditCardNo>","<cvvNo>" and Book Now
      | cardType         | month     | year |
      | American Express | January   | 2020 |
      | VISA             | February  | 2020 |
      | Master Card      | March     | 2019 |
      | Other            | April     | 2018 |
      | American Express | May       | 2020 |
      | VISA             | June      | 2021 |
      | Master Card      | July      | 2023 |
      | Other            | August    | 2024 |
      | VISA             | September | 2021 |
      | American Express | October   | 2023 |
      | Other            | November  | 2022 |
      | VISA             | December  | 2021 |
    Then Verify the "Booking Confirmation" message get sucessfull

    Examples: 
      | userName            | password | location | hotel        | roomType | noOfRoom | checkInDate | checkOutDate | adultsPerRoom | childPerRomm | firstName | lastName | address     | creditCardNo     | cvvNo |
      | LakshmananSanthanam | Lak@1999 | New York | Hotel Hervey | Deluxe   | 4 - Four | 20/12/2021  | 27/12/2021   | 2 - Two       | 1 - One      | Vinoth    | kumar    | OMR,chennai | 8765342816987654 |   789 |




  @InvaildMessage
  Scenario Outline: Verifying the error message on book a hotel page
    Given User should on adactinhotel page
    When User should login "<userName>","<password>"and login
    When Go to the select hotel page "<location>","<hotel>","<roomType>","<noOfRoom>","<checkInDate>","<checkOutDate>","<adultsPerRoom>","<childPerRomm>"search the hotel for the information
    When Select the one hotel and continue
    When Book a hotel without entering deatils
    Then Verify the "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month"and "Please Enter your Credit Card CVV Number"

    Examples: 
      | userName            | password | location | hotel        | roomType | noOfRoom | checkInDate | checkOutDate | adultsPerRoom | childPerRomm |
      | LakshmananSanthanam | Lak@1999 | New York | Hotel Hervey | Deluxe   | 4 - Four | 20/12/2021  | 27/12/2021   | 2 - Two       | 1 - One      |
