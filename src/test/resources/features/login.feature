Feature: Login Functionality As a user, I want to log in to LetCode so that I can access the features.
Scenario: Successful Login with valid credentials 
Given I open the LetCode login page
When I enter username "mor_2314" and I enter password "83r5^_" and I click on the login button
Then I should be logged in successfully
