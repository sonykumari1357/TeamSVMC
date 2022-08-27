Feature: Registration functionality

Scenario: verify that user is registered successfully
Given user is on registration page
When user enters all the mandatory details 
And user clicks on Submit button
Then event is registered successfully
And user is notified

