Feature: The LightSide
# in the given you need to figure out a way to find out if there are any available spots 
Scenario Outline: login as <user> type
	Given the user logs in as <user>
	And there are available spots for scheduling
	When the user hunts for a spot
	Then book button <expected> be displayed
	Examples:
	| user        | expected    | 
	| team member | should not  | 
	| team lead   | should      |
	| teacher     | should      |


# in the when step verify the confirmation
# in the then step verify: 
    # 1 you are now in the sceudle page
    # 2 new revervation is displayed 
    # 3 all of the reservation details
Scenario: Verify reservations details
	Given there are available spots for scheduling
	When the user makes a reservation
	Then the reservation should be displayed


Scenario: Error message on booking on reserved time
	Given the team lead has an existing reservation
	When the user tries to reverve for same time
	Then "you already have a conference for (selected date)" message should be displayed


Scenario: Cancel reservation and verify as different users
	Given team lead makes a reservation
    When the user cancels the reservation
    Then the resevation should disappear from the reservations page
    And the same room should be available for for the same time
    When the team member is on the reservations page
    Then the resevation should disappear from the reservations page
    When the team member is on the reservations page
    Then the resevation should disappear from the reservations page


Scenario: Cancel reservation and verify availability as different users
	Given team lead makes a reservation
    When the user cancels the reservation
    Then the same room should be available for the same time
    When the team member is on the reservations page
    Then the same room should be available for the same time   
    When the teacher is on the reservations page
    Then the same room should be available for the same time   


Scenario: two tabs
	Given there are available spots for scheduling
    And the team lead pull up all the available room for certain time
    And the user opens the application on a new tab
    When the user makes a reservation for the same time
    Then the user should not able able to finalize reservation on the first time


# use the test data given to you in the excel file
Scenario: verify user information: <email>
    Given the user logis in using "<email>" "<password>"
    When the user is on the my self page
    Then the user information should be displayed
    |<name>|<role>|<team>|<campus>|

#    Examples:
    | email          | password | name              | role      | team             | campus          |
    | tommy@usa.com  | freedom  | Thomas Jefferson  | important | team of the free | land of the free|
    | tommy@usa.com  | freedom  | Thomas Jefferson  | important | team of the free | land of the free|
    | tommy@usa.com  | freedom  | Thomas Jefferson  | important | team of the free | land of the free|
    | tommy@usa.com  | freedom  | Thomas Jefferson  | important | team of the free | land of the free|
    | tommy@usa.com  | freedom  | Thomas Jefferson  | important | team of the free | land of the free|

Scenario: verify team information
    Given the user logis in using "tommy@usa.com" "freedom"
    When the user is on the my team page
    Then system should display all member of the "flamingo" team
    |Sarah Connor   |
    |Samwise Gamgee |
    |Beatrix Kiddo  |
    |Jean-Luc Picard|