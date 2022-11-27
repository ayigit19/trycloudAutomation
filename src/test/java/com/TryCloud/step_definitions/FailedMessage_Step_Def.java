package com.TryCloud.step_definitions;

import com.TryCloud.pages.FailedMessagePage;
import com.TryCloud.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FailedMessage_Step_Def {

   FailedMessagePage failedMessagePage=new FailedMessagePage();
    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String username, String password) {
failedMessagePage.failedLogin(username,password);
    }
    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String Message) {
        Assert.assertTrue(failedMessagePage.wrongLogin.getText().equals("Wrong username or password."));
    }



}
