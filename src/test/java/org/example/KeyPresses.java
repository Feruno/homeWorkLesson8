package org.example;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyPresses {
    private WebDriver webDriverKeyPresses;
    private final String URI = "http://the-internet.herokuapp.com/key_presses?";


    public KeyPresses(WebDriver webDriver) {
        this.webDriverKeyPresses = webDriver;
        webDriver.get(URI);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@id='target']")
    public WebElement clickField;

    @FindBy(xpath = "//p[contains(text(), 'You entered:')]")
    public WebElement resultKeyPress;

    public void clickFieldAndPressSpecButton(String charPress) {
        if (charPress.length() != 1 ){
            clickField.sendKeys(Keys.valueOf(charPress));
        }else {
            clickField.sendKeys(charPress);
        }
    }

    public String checkChar(String charPress) {
        String str = charPress;
        return str;
    }

    public String showKey() {
        String str = resultKeyPress.getText();
        return  str.substring(13);
    }
}
