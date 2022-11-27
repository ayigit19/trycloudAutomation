package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(name="user")
    public WebElement enterUsername;
@FindBy(name="password")
    public WebElement enterPassword;
@FindBy(id="submit-form")
public WebElement loginButton;
public LoginPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}
public void login(String username,String password){
    enterUsername.sendKeys(username);
    enterPassword.sendKeys(password);
  //  loginButton.click();
}





}
