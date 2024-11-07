Feature: Add To Cart Functionality

  @SmokeTest,@RegressionTest
  Scenario: Add to cart

    Given Navigate to Magento
    When Enter email , password and click on the button
    Then Add to Cart a product as random
