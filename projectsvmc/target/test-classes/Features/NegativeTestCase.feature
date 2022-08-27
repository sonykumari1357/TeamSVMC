Feature: Registration functionality

Scenario: verify that user is displayed proper UI error message in case of wrong data entered
Given user is on registration page
When user enters following details

| Name | Sasim Kumar | 
| Email | sasim.apiit@gmail.com | 
| Phone num | 77957 | 
| Gender | Male |
| Type of event | Hack2Hire |

And user clicks on Submit button
Then user is not able to register
And error message is displayed
