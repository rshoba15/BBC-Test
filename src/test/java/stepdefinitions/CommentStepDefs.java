package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import commonMethods.WebConnector;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.containsString;




public class CommentStepDefs extends WebConnector{
	
	@Given("^I click on Comments button$")
	public void i_click_on_Comments_button() throws Exception {
		
		browser.findElement(By.xpath(prop.getProperty("Commentbutton"))).click();
	    browser.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
	    
	}

	@Given("^I have valid sign in credentials$")
	public void i_have_valid_sign_in_credentials() throws Exception {
		
		browser.switchTo().frame(prop.getProperty("Commentframe"));
		browser.findElement(By.xpath(prop.getProperty("Signin"))).click();
	    browser.findElement(By.xpath(prop.getProperty("Username"))).sendKeys(prop.getProperty("Usernamedetails"));
	    browser.findElement(By.xpath(prop.getProperty("Password"))).sendKeys(prop.getProperty("Passworddetails"));
	    browser.findElement(By.xpath(prop.getProperty("Signinbutton"))).click();
	 
	}

	@When("^I post a blank comment$")
	public void i_post_a_blank_comment() throws Exception {
		
	   browser.switchTo().frame(prop.getProperty("Commentframe"));
	   browser.findElement(By.xpath(prop.getProperty("Commentstextarea"))).sendKeys("");
		 
	}
		
	@When("^click on PostComment$")
	public void click_on_PostComment() throws Exception{
		
	  	browser.findElement(By.xpath(prop.getProperty("Postcommentsbutton"))).click();
	}
		
	@Then("^I should see the error message \"([^\"]*)\"$")
	public void i_should_see_the_error_message(String arg1) throws Exception {
		
		String error=browser.findElement(By.xpath(prop.getProperty("Errormessage"))).getText();
		Assert.assertEquals(arg1, error);
				
	}
	
	@When("^I post a text comment$")
	public void i_post_a_text_comment() throws Exception {
		 		
		browser.switchTo().frame(prop.getProperty("Commentframe"));
		browser.findElement(By.xpath(prop.getProperty("Commentstextarea"))).sendKeys(commenttext);
					  
	}

	@Then("^I should see the message \"([^\"]*)\"$")
	public void i_should_see_the_message(String arg1) throws Exception {
		
		browser.switchTo().frame(prop.getProperty("Commentframe"));
		String success=browser.findElement(By.xpath(prop.getProperty("Successmessage"))).getText();
		Assert.assertEquals(arg1, success);
			    
	}
	
	@Then("^the comment should be posted\\.$")
	public void the_comment_should_be_posted() throws Exception {
		
		String posted=browser.findElement(By.xpath(prop.getProperty("Postedcomments"))).getText();
		Assert.assertThat(posted, containsString(commenttext));
    
	}



}
