Feature: Login to page 

@yapma
Scenario Outline: Login verification Positive 

	Given The user is on login page 
	When user logs in  valid "<email>" and "<password>" 
 
	 
		|email      | password  |
	    |<email>    | <password>|
	
		
	Examples: 
		| email                    | password        |
		| gmcalister7n@google.nl   | arluenereolfo   |
		| uvalerio7o@google.com    | sharaipencot    |
		| apobred@hotmailmail.com  | bredpenhalurick |
		
	Then user should see home page