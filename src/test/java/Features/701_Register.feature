Feature: Register Functionality

  Scenario Outline:
    Given Navigate to Magento
    Then Click on the register linktext
    Then Enter "<firstname>","<lastname>","<email>","<password>" and click on the register button

    Examples:
      | firstname |lastname|        email      |    password         |
      |  team10_2 |Project | zgh28602@gmail.com|   em234AL.UUAM?     |
      |  team10_3 |Project |team99596@gmail.com|  Password_Team10_1  |