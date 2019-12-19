package com.cbt.Pages;

import com.cbt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage {

//    // this is only finds one email, it doesnot help in finding others. we can't use this
//    @FindBy(xpath= "//*[contains(text(), 'mbrackstone9@example.com')][@data-column-label=\"Email\"]")
//    WebElement email;

    public WebElement getContactEmail(String email){
        String xpath = "//*[contains(text(), '"+ email +"')][@data-column-label=\"Email\"]";
        return Driver.get().findElement(By.xpath(xpath));
    }

}
