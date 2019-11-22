package com.cybertek.tests.d9_tabs_frames_alerts_popups;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupAndAlerts {

    WebDriver driver; // it will be visible by every method

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterClass
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }

    @Test
    public void htmlPopup(){
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");

    }
}
