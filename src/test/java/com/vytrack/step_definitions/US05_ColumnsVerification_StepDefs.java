package com.vytrack.step_definitions;

import com.vytrack.pages.US05_VehiclesModelPage_SW;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class US05_ColumnsVerification_StepDefs {

US05_VehiclesModelPage_SW vehiclesModel = new US05_VehiclesModelPage_SW();
    @Then("user can see following columns on the Vehicles Model page.")
    public void user_can_see_following_columns_on_the_vehicles_model_page(io.cucumber.datatable.DataTable dataTable) {

BrowserUtils.waitFor(2);
        List<String> actualColumnNames = BrowserUtils.getElementsText(vehiclesModel.listOfColumns);
        System.out.println("actualColumnNames = " + actualColumnNames);
    }

    US05_VehiclesModelPage_SW us05VehiclesModelPageSw = new US05_VehiclesModelPage_SW();
    @When("driver navigates to the Vehicles Model page")
    public void driverNavigatesToTheVehiclesModelPage() {
        Driver.getDriver().get("https://qa1.vytrack.com/");
    }

    @Then("user sees the message {string}")
    public void userSeesTheMessage(String expectedErrorMessage) {
    String actualErrorMessage = us05VehiclesModelPageSw.ErrorMessageText.getText();
    }
}








































