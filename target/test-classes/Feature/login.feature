#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file
	Background:
		Given user opens the "https://www.netflix.com/login" url
  @tag123
  Scenario Outline: Title of your scenario
    Given user is on login Page
		When user enters "<Username>" in username 
		And user enters "<Password>" in password 
		Then welcome message should appear on webpage
		
		Examples:
		|Username|Password|
		|username|password123|
		
	@tag1
  Scenario: Title of your scenario
    Given user is on login Page
		When user enters "username" in username 
		And user enters "password" in password 
		Then welcome message should appear on webpage	
	
	@tag1
  Scenario: Title of your scenario
    Given user is on login Page
		When user enters "username" in username 
		And user enters "password" in password 
		Then welcome message should appear on webpage assert
	@tag1
  Scenario: Title of your scenario
    Given user is on login Page
		When user enters "username" in username 
		And user enters "password" in password 
		Then welcome message should appear on webpage	assert
		
	@tag1
  Scenario: Title of your scenario
    Given user is on login Page
		When user enters "username" in username 
		And user enters "password" in password 
		Then welcome message should appear on webpage	