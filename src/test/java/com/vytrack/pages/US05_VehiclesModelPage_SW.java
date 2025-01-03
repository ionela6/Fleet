package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US05_VehiclesModelPage_SW  extends BasePage{

    @FindBy(xpath = " //span[@class ='grid-header-cell__label']")
    public List<WebElement> listOfColumns;

    @FindBy(linkText = "Vehicles Model")
    public WebElement vehiclesModel;

    @FindBy(xpath = "//*[contains(text(), 'You do not have permission to perform this action.')]")
    public WebElement ErrorMessageText;
}
