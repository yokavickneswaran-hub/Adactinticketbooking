@tag
Feature: Ticket Booking Process
  Background: 
    Given User in Adactin login page

  @tag1
  Scenario: Ticket Booking Process
    When User enter username and password
      | username     | password     |
      | wizardian123 | wizardian123 |
    And User click login button
    And User select Location,Hotels ,Room Type ,Select Rooms,Check In,Check Out,Adults ,Children,Click Search button,select Hotel,continue,fill FName,LName,Address,CC_no,CC_Type,Expdate,CVV
    Then User click Booknow and copy Orderno to console
    
    