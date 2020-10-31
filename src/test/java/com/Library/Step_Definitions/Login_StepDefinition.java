package com.Library.Step_Definitions;

import com.Library.pages.LoginPage;
import com.Library.utils.ConfigurationReader;
import com.Library.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Login_StepDefinition {

LoginPage loginPage=new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user logs in")
    public void user_logs_in() {

        loginPage.login();
    }
    @Then("user should see Library")
    public void user_should_see_Library() {
        String expected="Book Management";
        String actual = loginPage.getPageSubTitleText().trim();
        Assert.assertEquals("Actual result not equal with expected",actual,expected);

    }
}
