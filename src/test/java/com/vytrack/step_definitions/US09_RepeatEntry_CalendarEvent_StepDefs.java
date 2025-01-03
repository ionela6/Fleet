package com.vytrack.step_definitions;

import com.vytrack.pages.US10_CalendarEventsPage_ID;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Random;

public class US09_RepeatEntry_CalendarEvent_StepDefs {
    US10_CalendarEventsPage_ID calendarEvent = new US10_CalendarEventsPage_ID();

    @When("user enters a number less than one in the Repeat Every field")
    public void user_enters_a_number_less_than_one_in_the_repeat_every_field() {
        calendarEvent.repeatEveryInbox.clear();
        int randomValue = (int) (Math.random() * 101) - 100;
        String randomValueAsString = String.valueOf(randomValue);
        calendarEvent.repeatEveryInbox.sendKeys(randomValueAsString);
    }

    @Then("error message one: {string} is displayed under the field")
    public void error_message_one_is_displayed_under_the_field(String expectedErrorMessage) {
        String actualErrorMessage = calendarEvent.errorMessage.getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }


    @When("user enters a number more than ninetynine in the Repeat Every field")
    public void user_enters_a_number_more_than_ninetynine_in_the_repeat_every_field() {
        calendarEvent.repeatEveryInbox.clear();
        int randomValue = (int) (Math.random() * 51) + 100;  // 51 is for range 100 to 150 inclusive
        String randomValueAsString = String.valueOf(randomValue);
        calendarEvent.repeatEveryInbox.sendKeys(randomValueAsString);
    }

    @Then("error message two: {string} is displayed under the field")
    public void error_message_two_is_displayed_under_the_field(String expectedErrorMessage) {
        String actualErrorMessage = calendarEvent.errorMessage.getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);

    }

}


