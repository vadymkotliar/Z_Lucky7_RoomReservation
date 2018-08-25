Feature: User Info

@temp
Scenario Outline: verify user information: <email>

    Given the user logs in using "<email>" "<password>"
    When the user is on the my self page
    Then the following user information should be displayed
    |<name>|
    |<role>|
    |<campus>|
   
    Examples:
    | email                             | password          | name                  | role                  | campus    |
    | sdarben7g@alibaba.com	            | angiecoatham	    | Angie Coatham         | student-team-member   | VA        |
    | fklampt80@seesaa.net	            | timotheameade     | Timothea Meade	    | student-team-member   | VA        |
    | teacherillemmyearland@gmail.com	| lemmyearland      | Lemmy	Earland	        | teacher               | IL        |
    | mdarlastonc0@skyrock.com	        | wildencreavan     | Wilden Creavan        | student-team-member   | IL        |
    | ecrasford8s@dagondesign.com       | bricesiddell      | Brice Siddell	        | student-team-member   | VA        | 