Feature: Login Action



Scenario: Successful Login with Valid and Invalid Credentials
	
	Given User start browser
	When User insert valid username and password
	Then User click login button
	Then User click signout button
	Then User close browser
