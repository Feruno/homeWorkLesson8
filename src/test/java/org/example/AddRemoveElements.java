package org.example;

import com.codeborne.selenide.CollectionCondition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.$$;

public class AddRemoveElements {
    private  WebDriver webDriverAddRemoveElem;

    private WebDriverWait driverWaitAddRemoveElem;
    private final String URI = "http://the-internet.herokuapp.com/add_remove_elements/";

    private final int TIMEOUT = 30;

    public AddRemoveElements(WebDriver webDriver) {
        this.webDriverAddRemoveElem = webDriver;
        webDriver.get(URI);
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(xpath = "//button")
    public WebElement addButton;

    public void countElements(Integer numElements){
        for (int i = 0; i < numElements ; i++) {
            addButton.click();
        }
    }
}
