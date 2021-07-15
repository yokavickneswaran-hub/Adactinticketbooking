$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Featurefile/FeatureFile.feature");
formatter.feature({
  "name": "Ticket Booking Process",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User in Adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_in_Adactin_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Ticket Booking Process",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "User enter username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "wizardian123",
        "wizardian123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select Location,Hotels ,Room Type ,Select Rooms,Check In,Check Out,Adults ,Children,Click Search button,select Hotel,continue,fill FName,LName,Address,CC_no,CC_Type,Expdate,CVV",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_select_Location_Hotels_Room_Type_Select_Rooms_Check_In_Check_Out_Adults_Children_Click_Search_button_select_Hotel_continue_fill_FName_LName_Address_CC_no_CC_Type_Expdate_CVV()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Booknow and copy Orderno to console",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_click_Booknow_and_copy_Orderno_to_console()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});