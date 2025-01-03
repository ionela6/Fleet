package com.vytrack.pages;


import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US01_MainModulePage extends BasePage {

    public US01_MainModulePage(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul")
    public WebElement mainModule;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/a/span")
    public WebElement moduleName;





}
