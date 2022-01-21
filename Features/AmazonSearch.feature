@FeatureTest
Feature: Test script for Amazon search


	
	Scenario: Amazon search
	
	Given user start browser
	When user insert product details into search field
	Then user click search button
	Then user close browser
	
	