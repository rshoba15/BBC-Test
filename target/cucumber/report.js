$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/comment.feature");
formatter.feature({
  "name": "Comment on the news article",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I click on Comments button",
  "keyword": "Given "
});
formatter.match({
  "location": "CommentStepDefs.i_click_on_Comments_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have valid sign in credentials",
  "keyword": "And "
});
formatter.match({
  "location": "CommentStepDefs.i_have_valid_sign_in_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Posting blank comment",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I post a blank comment",
  "keyword": "When "
});
formatter.match({
  "location": "CommentStepDefs.i_post_a_blank_comment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on PostComment",
  "keyword": "And "
});
formatter.match({
  "location": "CommentStepDefs.click_on_PostComment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the error message \"You need to write your comment before you post it.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CommentStepDefs.i_should_see_the_error_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I click on Comments button",
  "keyword": "Given "
});
formatter.match({
  "location": "CommentStepDefs.i_click_on_Comments_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have valid sign in credentials",
  "keyword": "And "
});
formatter.match({
  "location": "CommentStepDefs.i_have_valid_sign_in_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Posting text comment",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I post a text comment",
  "keyword": "When "
});
formatter.match({
  "location": "CommentStepDefs.i_post_a_text_comment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on PostComment",
  "keyword": "And "
});
formatter.match({
  "location": "CommentStepDefs.click_on_PostComment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the message \"Thanks, your comment has been posted.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CommentStepDefs.i_should_see_the_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the comment should be posted.",
  "keyword": "And "
});
formatter.match({
  "location": "CommentStepDefs.the_comment_should_be_posted()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});