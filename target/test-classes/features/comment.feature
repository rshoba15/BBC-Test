Feature: Comment on the news article

	Background:
		Given I click on Comments button 
		And I have valid sign in credentials

@test
	Scenario: Posting blank comment
		When I post a blank comment
		And click on PostComment
		Then I should see the error message "You need to write your comment before you post it."
@test
	Scenario: Posting text comment
		When I post a text comment
		And click on PostComment
		Then I should see the message "Thanks, your comment has been posted."
		And the comment should be posted.

