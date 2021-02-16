Feature: Login as different users

  Scenario: Login as a driver user
    Given the user is on the login page
    When the user logs in using "User10" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"

    #homework
 Scenario:
   Given the user logged in as "sales manager"
   Then the user should be able to login
   And the title contains "Dashboard"
   #usertype for example: driver, storemanager, salesmanager
   #you will have one step definition and it will handle different usertype's