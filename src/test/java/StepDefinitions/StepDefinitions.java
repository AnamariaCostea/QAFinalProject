package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.HomePage;

import java.time.Duration;

import static hooks.GlobalHooks.driver;

public class StepDefinitions {
    @Given("Customer clicks on ContulMeu link")
    public void customerClicksOnContulMeuLink() {
        HomePage homePage = new HomePage(driver);
        homePage.clickContulMeu();
    }

    @When("Customer enters {string} and {string}")
    public void customerEntersUsernameAndPassword(String username, String password) {
        HomePage homePage = new HomePage(driver);
        homePage.inputUsername(username);
        homePage.inputPassword(password);
    }

    @And("Customer clicks IntraInCont button")
    public void customerClicksIntraInContButton() {
        HomePage homePage = new HomePage(driver);
        homePage.clickIntraInContButton();
    }

    @Then("currentURL contains {string}")
    public void currenturlContains(String expectedPartialLink) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        boolean isURLUpdated = wait.until(ExpectedConditions.urlContains(expectedPartialLink));

        Assert.assertTrue("The URL does not contain the expected partial link", isURLUpdated);
    }
}
