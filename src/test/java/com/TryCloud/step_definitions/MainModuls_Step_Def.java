package com.TryCloud.step_definitions;

import com.TryCloud.pages.MainModulsPage;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Arrays;

public class MainModuls_Step_Def {
MainModulsPage mainModulsPage = new MainModulsPage();

    @When("the users  log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
       mainModulsPage.login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
    }
    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(io.cucumber.datatable.DataTable dataTable) {
        mainModulsPage.dashboardButton.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));
        mainModulsPage.filesButton.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("files"));
        mainModulsPage.photosButton.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("photos"));
        mainModulsPage.activityButton.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("activity"));
        mainModulsPage.talkButton.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("spreed"));
        mainModulsPage.contactsButton.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("contacts"));
        mainModulsPage.circlesButton.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("circles"));
        mainModulsPage.calendarButton.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("calendar"));
        mainModulsPage.deckButton.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("deck"));





    }


}
