Feature: Store Locator Functionality

  #@Login
  #Scenario: Successful login with valid credentials
  #Given The user navigates to FirstCry Home Page
  #When The user clicks on login
  #And The user enters the email id or mobile no.
  #Then The user clicks on Continue
  #And The user enters the OTP sent to his registered email ID or mobile no
  #Then Click on Submit
  #Then The user should be redirected to the Home Page
  @Find_Stores
  Scenario: User can find Stores & Preschools option in home page after Login
    Given The user is on Home Page
    When The user clicks on StoresPreschools
    When The user  click on find store button
    Then The user will be navigate to the store locator page

  @Selecting_All
  Scenario Outline: User selects store type, state, and city from the dropdown
    Given The user opens the home page
    When The user presses on the StoresPreschools
    And The user presses on find stores button
    And The user selects store <StoreType>
    And The user selects state <State>
    And The user selects city <City>
    Then The user gets outcome based on the selection of data

    Examples: 
      | StoreType | State | City   |
      | FirstCry  | Bihar | Chapra |
      | Babyhug   | Delhi |        |
      |           |       |        |
      
  #@Selecting_All
  #Scenario Outline: User selects store type, state, and city from the dropdown
    #Given The user opens the home page
    #When The user press on the StoresPreschools
    #When the user press on find stores button
    #When The user selects store<StoreType>
    #When The user selects state <State>
    #When The user selects city <City>
    #Then The user gets outcome based on the selection of data
#
    #Examples: 
      #| StoreType | State | City   |
      #| FirstCry  | Bihar | Chapra |
      #| Babyhug   | Delhi |        |
      #|           |       |        |
