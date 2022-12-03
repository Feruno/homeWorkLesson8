package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkboxes {
    private  WebDriver webDriverCheckboxes;

    private WebDriverWait driverWaitCheckboxes;
    private final String URI = "http://the-internet.herokuapp.com/checkboxes";

    private final int TIMEOUT = 30;

    public Checkboxes(WebDriver webDriver) {
        this.webDriverCheckboxes = webDriver;
        webDriver.get(URI);
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(xpath = "//input[@type='checkbox']") // input[type="checkbox"]:not(:checked)
    public WebElement clickCheckboxes;

    public void clickCheckbox(){
        clickCheckboxes.click();
    }
    public boolean checkStatusCheckbox(){
        return clickCheckboxes.isSelected();
    }
}
