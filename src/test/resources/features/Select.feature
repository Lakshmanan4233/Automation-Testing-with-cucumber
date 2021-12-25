@AdactinPage
Feature: Verify the Adactin hotel webpage

  @SelectHotel
  Scenario Outline: Verify the select all fields on search hotel page
    Given User should on adactinhotel page
    When User should login "<userName>","<password>"and login
    And User should select "<location>","<hotels>","<roomType>","<noOfRoom>","<checkIn>","<checkOut>","<adultsPerRoom>","<childPerRoom>" and search
    Then Verify  navigate to "Select Hotel"  message on the page

    Examples: 
      | userName            | password | location | hotels      | roomType | noOfRoom | checkIn    | checkOut   | adultsPerRoom | childPerRoom |
      | LakshmananSanthanam | Lak@1999 | Sydney   | Hotel Creek | Standard | 2 - Two  | 22/12/2021 | 22/12/2021 | 1 - One       | 1 - One      |

  @SearchHotel
  Scenario Outline: Verify the select mandatory fields on search hotel page
    Given User should on adactinhotel page
    When User should login "<userName>","<password>"and login
    When User should select mandatory fields "<location>","<noOfRoom>","<checkIn>","<checkOut>","<adultsPerRoom>" and search
    Then Verify  navigate to "Select Hotel"  page

    Examples: 
      | userName            | password | location | noOfRoom | checkIn    | checkOut   | adultsPerRoom |
      | LakshmananSanthanam | Lak@1999 | Sydney   | 2 - Two  | 15/12/2021 | 17/12/2021 | 2 - Two       |

  @DateChecking
  Scenario Outline: Verify the checking the date in search hotel page
    Given User should on adactinhotel page
    When User should login "<userName>","<password>"and login
    When User should enter uneven dates "<checkIn>","<checkOut>" and search
    Then Verify the error messsages "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | userName            | password | checkIn    | checkOut   |
      | LakshmananSanthanam | Lak@1999 | 15/12/2022 | 17/12/2020 |



  @WithoutEnter
  Scenario Outline: Verify the search the hotel without entering data
    Given User should on adactinhotel page
    When User should login "<userName>","<password>"and login
    When User without entering data and search
    Then Verify the "Please Select a Location" message got successful

    Examples: 
      | userName            | password |
      | LakshmananSanthanam | Lak@1999 |
