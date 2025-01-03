package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class US01_MainModule_StepDefs {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @Given("the user is logged in as a {string}")
    public void the_user_is_logged_in_as_a(String string) {
        LoginPage loginPage = new LoginPage();
        String username = "storemanager51";
        String password = "UserUser123";
        loginPage.login(username, password);

    }
    @Then("the user can see the below module names:")
    public void the_user_can_see_the_below_module_names(DataTable dataTable) {

        List<String> expectedModules = dataTable.asList(String.class);
        BrowserUtils.sleep(2);

        assertEquals("There should be exactly 8 modules visible", 8, expectedModules.size());

        System.out.println("Expected Modules: " + expectedModules);
    }

    @Given("the user is logged in as {string}")
    public void theUserIsLoggedInAs(String arg0) {
        LoginPage loginPage = new LoginPage();
        String username = "storemanager51";
        String password = "UserUser123";
        loginPage.login(username, password);

    }

    @When("the user can see the following module names:")
    public void theUserCanSeeTheFollowingModuleNames(DataTable dataTable) {
        List<String> expectedModules = dataTable.asList(String.class);

        assertTrue("The user should seet 4 module.", expectedModules.contains(expectedModules));

        expectedModules = Arrays.asList("Fleet", "Customers", "Activities", "System");


    }


}

