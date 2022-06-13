package com.invoice_cloud.step_definitions;

import com.invoice_cloud.pages.AssighmentPage;
import com.invoice_cloud.utilities.ConfigurationReader;
import com.invoice_cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AssignmentStepDefinitions {

    AssighmentPage assighmentPage = new AssighmentPage();

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("assessmentURL"));
    }

    @When("user clicks on Add Elements for {int} times")
    public void userClicksOnAddElementsForTimes(int n) {
        for (int i = 0; i < n; i++) {
            assighmentPage.button.click();
        }
    }

    @Then("verify that the number of elements added equals {int}")
    public void verifyThatTheNumberOfElementsAddedEquals(int expectedNOfElements) {
        int actualNumberOfElements = assighmentPage.elements.size();
        Assert.assertEquals(expectedNOfElements,actualNumberOfElements);
    }
}
