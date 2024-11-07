Feature: Add Address Functionality

  @RegressionTest
  Scenario Outline: Add Address for users

    Given Navigate to Magento
    When Enter email "<email>" , password "<password>" and click on the button for this scenario
    When Open the My Account Page
    Then Enter phone "<phone>","<streetAddress>","<city>","<zipCode>" and other info of form

    Examples:
      |       email       |      password     |     phone      | streetAddress |      city     |   zipCode  |
      |team99596@gmail.com| Password_Team10_1 |    45676890    |  7899 street  |     Ankara    |    89000   |
      |zgh28602@gmail.com |   em234AL.UUAM?   |    98776554    |  67 street 5  |     Izmir     |    55566   |
      |team10@gmail.com   |     İBRAHİMege    |    64588434    |  2233 street  |    Antalya    |    23222   |