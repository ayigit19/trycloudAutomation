package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainModulsPage {

    @FindBy(name = "user")
    public WebElement enterUsername;
    @FindBy(name = "password")
    public WebElement enterPassword;
    @FindBy(id = "submit-form")
    public WebElement loginButton;
    @FindBy(xpath = "(//a[@aria-label='Dashboard'])[1]")
public WebElement dashboardButton;
    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement filesButton;
    @FindBy(xpath = "(//a[@aria-label='Photos'])[1]")
    public WebElement photosButton;
    @FindBy(xpath = "(//a[@aria-label='Activity'])[1]")
    public WebElement activityButton;
    @FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
    public WebElement talkButton;
    @FindBy(xpath = "(//a[@aria-label='Contacts'])[1]")
    public WebElement contactsButton;
    @FindBy(xpath = "(//a[@aria-label='Circles'])[1]")
    public WebElement circlesButton;
    @FindBy(xpath = "(//a[@aria-label='Calendar'])[1]")
    public WebElement calendarButton;
    @FindBy(xpath = "(//a[@aria-label='Deck'])[1]")
    public WebElement deckButton;





    public void login(String username, String password) {
        enterUsername.sendKeys(username);
        enterPassword.sendKeys(password);
        loginButton.click();
    }
    public MainModulsPage(){PageFactory.initElements(Driver.getDriver(),this);}

}