package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleCostsPage {
    public VehicleCostsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//span[.='Type'])[1]")
    public WebElement typeItem;
    @FindBy(xpath = "(//span[.='Total Price'])[1]")
    public WebElement totalPriceItem;
    @FindBy(xpath = "(//span[.='Date'])[1]")
    public WebElement dateItem;

}
