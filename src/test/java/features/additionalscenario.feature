Feature: Comment on the news article

	Background:
		Given I click on Comments button 
		
@manual
    Scenario: User less than 14 years old trying to post comment
   		Given I am less than 14years old with valid Signin credetials
   		Then I should see the message "It looks like you're not the right age to use this feature."
   		
@manual		
	Scenario: Post images in the comments
		Given I click on Signin with valid credentials
		When I post an image comment
		And click on PostComment
		Then I should see the message "Thanks, your comment has been posted."
		And the comment should be posted

@manual
	Scenario: Post comment by new user 
		Given I click on Register 
        And complete my registration process
		When I post a text comment
		And click on PostComment
		Then I should see the message "Thanks, your comment has been posted."
		And the comment should be posted
  







