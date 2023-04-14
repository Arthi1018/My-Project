Feature: Adactin Hotel Application

@Login
Scenario Outline: Login
Given Launch the browser and pass the URL
When Pass "<username>"  in the username field
And Pass "<password>" in the password field
And Click on login button
Then User should get navigated to the Search hotels page

Examples:
|username |password |
|Arthiha1018| IA779U|

@Hotels
Scenario: Search Hotels
Given Check whether user has been navigated to search hotels page
When Select the location 
And Select the room
And Click on search hotels
Then User should get navigated to Booking confirmation page

