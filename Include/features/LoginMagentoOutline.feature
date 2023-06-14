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

@login @smoke @regression
Feature: Login
  As a user I want to login to Magento Page

	@loginvalid
  Scenario Outline: Login03 - User attempt to try login fields validation
    Given User is in Magento Login Page
    When User input email "<email>"
   		And User input password "<password>"
    	And User click Sign in Button
   Then User will be directed to Home Page
 
   Examples:
    |email									| password |
    | firstlast@email.com	  | Pass.123 |
    | 											| 				 |
    | mailtest9@email.com 	| 				 |
    | 											| Password |