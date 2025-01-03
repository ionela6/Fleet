package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US03_PinBarPage extends BasePage {
    public US03_PinBarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "Learn how to use this space")
    public WebElement LearnHowToUseThisSpace;

    @FindBy(xpath = "//h3[.='How To Use Pinbar']")
    public WebElement headingString;

    @FindBy(xpath = "//div[@class='clearfix']//p[1]")
    public WebElement text ;

    @FindBy(xpath = "//img [@src='/bundles/oronavigation/images/pinbar-location.jpg']")

    public WebElement image;
}
