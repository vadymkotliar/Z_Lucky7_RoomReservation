Feature: Login 

@temp
Scenario: user login with valid credentials

	Given user is on the login page
	When user logins in with valid username and password
	Then the user information should be displayed in self menu