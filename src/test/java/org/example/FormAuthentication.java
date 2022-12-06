package org.example;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FormAuthentication {
    private final WebDriver webDriver;
    private final String URI = "http://the-internet.herokuapp.com/login";

    public FormAuthentication(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.get(URI);

        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    public WebElement loginInput;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button")
    public WebElement buttonLoginInput;

    @FindBy(xpath = "//div[@id='flash']")
    public WebElement titleFeedBack;




    public void fillLoginAndPassword(String login, String password){
        loginInput.sendKeys(login);
        passwordInput.sendKeys(password);
    }

    public void clickButton(){

        buttonLoginInput.click();
    }



}
