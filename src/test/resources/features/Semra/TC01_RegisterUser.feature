Feature: TC01_User must register
  Background:Launch browser
  Given Navigate to url http://automationexercise

    Scenario:TC01 User register to the website
      And Verify that home page is visible successfully
      When Click on 'Signup Login' button
      Then Verify 'New User Signup' is visible
      And Enter name and email address
      And Click 'Signup' button
      Then Verify that 'ENTER ACCOUNT INFORMATION' is visible
      And Fill details Title Name Email Password Date of birth
      And Select checkbox 'Sign up for our newsletter'
      And Select checkbox 'Receive special offers from our partners'
      And Fill details: First name Last name Company Address Address2 Country State City Zipcode Mobile Number
      And Click 'Create Account button'
      Then Verify that 'ACCOUNT CREATED!' is visible
      When Click 'Continue' button
      Then Verify that 'Logged in as username' is visible
      When Click 'Delete Account' button
      Then Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button











