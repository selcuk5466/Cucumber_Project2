Feature: Order product functionality

  @SmokeTest, @RegressionTest
  Scenario: Order product

    Given Navigate to Magento
    When Enter email , password and click on the button
    Then Order product