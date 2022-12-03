package org.example;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyPresses {
    private WebDriver webDriverKeyPresses;

    private WebDriverWait driverWaitKeyPresses;
    private final String URI = "http://the-internet.herokuapp.com/key_presses?";

    private final int TIMEOUT = 30;

    public KeyPresses(WebDriver webDriver) {
        this.webDriverKeyPresses = webDriver;
        webDriver.get(URI);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@id='target']")
    public WebElement clickField;

    public void clickFieldAndPressButton(Character charPress){
        clickField.sendKeys(""+ charPress +"");
    }

    public char checkChar(Character charPress){
        return charPress;
    }
}
