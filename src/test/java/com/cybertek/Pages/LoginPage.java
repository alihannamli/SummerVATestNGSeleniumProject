package com.cybertek.Pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement username;

    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(name="_submit")
    public WebElement submit;

    public void login(String userNameStr, String passwordStr){
        username.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
    }
}


