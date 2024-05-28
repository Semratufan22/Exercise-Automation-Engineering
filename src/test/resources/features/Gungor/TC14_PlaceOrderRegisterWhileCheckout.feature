@TC14

  Feature: Place Order Register While Checkout
    Scenario: TC14 Place Order Register While Checkout

      Then Verify that home page is visible successfully Gungor
      And Add products to cart Gungor
      And Click 'Cart' button Gungor
      Then Verify that cart page is displayed Gungor
      And Click Proceed To Checkout Gungor
      And Click 'Register / Login' button Gungor
      And Fill all details in Signup and create account Gungor
      Then Verify 'ACCOUNT CREATED!' and click 'Continue' button Gungor
      Then Verify ' Logged in as username' at top Gungor
      And Click 'Cart' button Gungor
      And Click 'Proceed To Checkout' button Gungor
      Then Verify Address Details and Review Your Order Gungor
      And Enter description in comment text area and click 'Place Order' Gungor
      And Enter payment details: Name on Card, Card Number, CVC, Expiration date Gungor
      And Click 'Pay and Confirm Order' button Gungor
      Then Verify success message 'Your order has been placed successfully!' Gungor
      And Click 'Delete Account' button Gungor
      Then Verify 'ACCOUNT DELETED!' and click 'Continue' button Gungor












