Feature: Feedback functionality

Scenario: verify that feedback is sent to registered candidate 
Given user is on feedback page
When user enters all the mandatory details on feedback page
And user clicks on Submit feedback button
Then feedback is sent to registered candidate successfully

