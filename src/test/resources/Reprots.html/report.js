$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/CancelBooking.feature");
formatter.feature({
  "name": "Verify the order cancelled sucessfull",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying the Error message in  booked itinerary page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CancelBooking"
    }
  ]
});
formatter.step({
  "name": "User should on adactinhotel page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should login \"\u003cuserName\u003e\",\"\u003cpassword\u003e\"and login",
  "keyword": "When "
});
formatter.step({
  "name": "User Go to the select hotel page \"\u003clocation\u003e\",\"\u003chotel\u003e\",\"\u003croomType\u003e\",\"\u003cnoOfRoom\u003e\",\"\u003ccheckInDate\u003e\",\"\u003ccheckOutDate\u003e\",\"\u003cadultsPerRoom\u003e\",\"\u003cchildPerRomm\u003e\"search the hotel for the information",
  "keyword": "When "
});
formatter.step({
  "name": "User Select the one hotel and continue",
  "keyword": "When "
});
formatter.step({
  "name": "User Give the details \"\u003cfirstName\u003e\",\"\u003clastName\u003e\",\"\u003caddress\u003e\",\"\u003ccreditCardNo\u003e\",\"\u003ccvvNo\u003e\" and Book Now",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "cardType",
        "month",
        "year"
      ]
    },
    {
      "cells": [
        "American Express",
        "January",
        "2020"
      ]
    },
    {
      "cells": [
        "VISA",
        "February",
        "2020"
      ]
    },
    {
      "cells": [
        "Master Card",
        "March",
        "2019"
      ]
    },
    {
      "cells": [
        "Other",
        "April",
        "2018"
      ]
    },
    {
      "cells": [
        "American Express",
        "May",
        "2020"
      ]
    },
    {
      "cells": [
        "VISA",
        "June",
        "2021"
      ]
    },
    {
      "cells": [
        "Master Card",
        "July",
        "2023"
      ]
    },
    {
      "cells": [
        "Other",
        "August",
        "2024"
      ]
    },
    {
      "cells": [
        "VISA",
        "September",
        "2021"
      ]
    },
    {
      "cells": [
        "American Express",
        "October",
        "2023"
      ]
    },
    {
      "cells": [
        "Other",
        "November",
        "2022"
      ]
    },
    {
      "cells": [
        "VISA",
        "December",
        "2021"
      ]
    }
  ]
});
formatter.step({
  "name": "User is go to the booked itinerary page from booking confirmation page",
  "keyword": "When "
});
formatter.step({
  "name": "Cancel the order ID and verify the \"The booking has been cancelled.\" message got sucessful",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "location",
        "hotel",
        "roomType",
        "noOfRoom",
        "checkInDate",
        "checkOutDate",
        "adultsPerRoom",
        "childPerRomm",
        "firstName",
        "lastName",
        "address",
        "creditCardNo",
        "cvvNo"
      ]
    },
    {
      "cells": [
        "LakshmananSanthanam",
        "Lak@1999",
        "New York",
        "Hotel Hervey",
        "Deluxe",
        "4 - Four",
        "25/12/2021",
        "27/12/2021",
        "2 - Two",
        "1 - One",
        "Vinoth",
        "kumar",
        "OMR,chennai",
        "8765342816987654",
        "789"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying the Error message in  booked itinerary page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CancelBooking"
    }
  ]
});
formatter.step({
  "name": "User should on adactinhotel page",
  "keyword": "Given "
});
formatter.match({
  "location": "Step.user_should_on_adactinhotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should login \"LakshmananSanthanam\",\"Lak@1999\"and login",
  "keyword": "When "
});
formatter.match({
  "location": "Step.user_should_login_and_login(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Go to the select hotel page \"New York\",\"Hotel Hervey\",\"Deluxe\",\"4 - Four\",\"25/12/2021\",\"27/12/2021\",\"2 - Two\",\"1 - One\"search the hotel for the information",
  "keyword": "When "
});
formatter.match({
  "location": "Step.user_Go_to_the_select_hotel_page_search_the_hotel_for_the_information(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Select the one hotel and continue",
  "keyword": "When "
});
formatter.match({
  "location": "Step.user_Select_the_one_hotel_and_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Give the details \"Vinoth\",\"kumar\",\"OMR,chennai\",\"8765342816987654\",\"789\" and Book Now",
  "rows": [
    {
      "cells": [
        "cardType",
        "month",
        "year"
      ]
    },
    {
      "cells": [
        "American Express",
        "January",
        "2020"
      ]
    },
    {
      "cells": [
        "VISA",
        "February",
        "2020"
      ]
    },
    {
      "cells": [
        "Master Card",
        "March",
        "2019"
      ]
    },
    {
      "cells": [
        "Other",
        "April",
        "2018"
      ]
    },
    {
      "cells": [
        "American Express",
        "May",
        "2020"
      ]
    },
    {
      "cells": [
        "VISA",
        "June",
        "2021"
      ]
    },
    {
      "cells": [
        "Master Card",
        "July",
        "2023"
      ]
    },
    {
      "cells": [
        "Other",
        "August",
        "2024"
      ]
    },
    {
      "cells": [
        "VISA",
        "September",
        "2021"
      ]
    },
    {
      "cells": [
        "American Express",
        "October",
        "2023"
      ]
    },
    {
      "cells": [
        "Other",
        "November",
        "2022"
      ]
    },
    {
      "cells": [
        "VISA",
        "December",
        "2021"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Step.user_Give_the_details_and_Book_Now(String,String,String,String,String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is go to the booked itinerary page from booking confirmation page",
  "keyword": "When "
});
formatter.match({
  "location": "Step.user_is_go_to_the_booked_itinerary_page_from_booking_confirmation_page()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.base.Baseclass.getAttribute(Baseclass.java:88)\r\n\tat org.base.BookingConfirmationPage.performance(BookingConfirmationPage.java:27)\r\n\tat com.stepDefn.Step.user_is_go_to_the_booked_itinerary_page_from_booking_confirmation_page(Step.java:182)\r\n\tat ✽.User is go to the booked itinerary page from booking confirmation page(src/test/resources/features/CancelBooking.feature:23)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Cancel the order ID and verify the \"The booking has been cancelled.\" message got sucessful",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.cancel_the_order_ID_and_verify_the_message_got_sucessful(String)"
});
formatter.result({
  "status": "skipped"
});
});