package com.vytrack.step_definitions;

import com.vytrack.pages.US03_PinBarPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US03_Pinbar_StepDefs {
    US03_PinBarPage pinBarPage = new US03_PinBarPage();

    @When("user click the Learn how to use this space link")
    public void user_click_the_learn_how_to_use_this_space_link() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        BrowserUtils.sleep(3);
        BrowserUtils.waitForTitleContains("Dashboard");
        pinBarPage.LearnHowToUseThisSpace.click();
    }
    @Then("user should see a heading {string}")
    public void user_should_see_a_heading(String expectedHeading) {
        String actualHeading = pinBarPage.headingString.getText();
        Assert.assertEquals("actual Heading is not same as the expected",expectedHeading,actualHeading);
    }
    @Then("user should see the text {string}")
    public void user_should_see_the_text(String expectedText) {
        String actualText = pinBarPage.text.getText();
        Assert.assertEquals("actual text is not same as the expected",expectedText,actualText);

    }

    @Then("user should see an image on the page with this source {string}")
    public void userShouldSeeAnImageOnThePageWithThisSource(String expectedImageSource) {
        String actualImageSource = pinBarPage.image.getAttribute("src");
        Assert.assertEquals("actual image source is not same as the expected",expectedImageSource,actualImageSource);
    }
}
