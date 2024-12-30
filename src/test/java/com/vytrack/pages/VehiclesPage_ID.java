package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclesPage_ID extends BasePage {
    public VehiclesPage_ID() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//tr[@class='grid-row row-click-action']/td[@class='action-cell grid-cell grid-body-cell']")
    public WebElement threeDotsMenu;
    @FindBy(xpath = "//div[@class='dropdown open']")
    public WebElement hiddenMenu;
    @FindBy(xpath = "(//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu'])[1]/li/ul/li[@class='launcher-item']/a")
    public List<WebElement> overflowMenuItems;
    @FindBy(xpath = "(//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu'])[1]/li/ul/li[@class='launcher-item']/a[@title='View']")
    public WebElement viewItem;

}
