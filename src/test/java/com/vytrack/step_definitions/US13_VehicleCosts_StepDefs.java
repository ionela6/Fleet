package com.vytrack.step_definitions;

import com.vytrack.pages.VehicleCostsPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class US13_VehicleCosts_StepDefs {
    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();

    @Then("the user can see three columns on the Vehicle Costs page")
    public void the_user_can_see_three_columns_on_the_vehicle_costs_page(List<String> expectedColumns) {
        List<String> actualColumns = new ArrayList<>();

        actualColumns.add(vehicleCostsPage.typeItem.getText());
        actualColumns.add(vehicleCostsPage.totalPriceItem.getText());
        actualColumns.add(vehicleCostsPage.dateItem.getText());

        List<String> expectedColumnsLower = BrowserUtils.convertListToLowerCase(expectedColumns);
        List<String> actualColumnsLower = BrowserUtils.convertListToLowerCase(actualColumns);

        Assert.assertEquals(expectedColumnsLower, actualColumnsLower);


    }
}