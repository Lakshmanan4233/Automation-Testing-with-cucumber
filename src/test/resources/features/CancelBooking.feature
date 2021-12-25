Feature: Verify the order cancelled sucessfull

  @CancelBooking
  Scenario Outline: Verifying the Error message in  booked itinerary page
    Given User should on adactinhotel page
    When User should login "<userName>","<password>"and login
    When User Go to the select hotel page "<location>","<hotel>","<roomType>","<noOfRoom>","<checkInDate>","<checkOutDate>","<adultsPerRoom>","<childPerRomm>"search the hotel for the information
    When User Select the one hotel and continue
    When User Give the details "<firstName>","<lastName>","<address>","<creditCardNo>","<cvvNo>" and Book Now
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
    When User is go to the booked itinerary page from booking confirmation page
    Then Cancel the order ID and verify the "The booking has been cancelled." message got sucessful

    Examples: 
      | userName            | password | location | hotel        | roomType | noOfRoom | checkInDate | checkOutDate | adultsPerRoom | childPerRomm | firstName | lastName | address     | creditCardNo     | cvvNo |
      | LakshmananSanthanam | Lak@1999 | New York | Hotel Hervey | Deluxe   | 4 - Four | 25/12/2021  | 27/12/2021   | 2 - Two       | 1 - One      | Vinoth    | kumar    | OMR,chennai | 8765342816987654 |   789 |
