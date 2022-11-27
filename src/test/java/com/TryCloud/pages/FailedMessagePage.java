package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FailedMessagePage {

    @FindBy(name="user")
    public WebElement enterUsername1;
    @FindBy(name="password")
    public WebElement enterPassword1;

    @FindBy(xpath="//p[@class='warning wrongPasswordMsg']")
    public WebElement wrongLogin;

    public void failedLogin(String username,String password){
        enterUsername1.sendKeys(username);
        enterPassword1.sendKeys(password);
        //  loginButton.click();
    }
public FailedMessagePage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

}
