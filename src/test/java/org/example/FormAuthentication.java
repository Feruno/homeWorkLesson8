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

    private WebDriverWait driverWait;
    private final String URI = "http://the-internet.herokuapp.com/login";

    private final int TIMEOUT = 30;

    public FormAuthentication(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.get(URI);
       // driverWait = new WebDriverWait(webDriver, TIMEOUT, 500);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    public WebElement loginInput;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button") //  //button[contains(text(), ' Login')] не работает
    public WebElement buttonLoginInput;

    @FindBy(xpath = "//div[@id='flash']") //  //div[contains(text(), 'You logged into a secure area!')] другой рабочий вариант но не подходит из-за узконаправленности
    public WebElement titleFeedBack;


    public void fillLoginAndPassword(String login, String password){
        loginInput.sendKeys(login);
        passwordInput.sendKeys(password);
    }

    public void clickButton(){

        buttonLoginInput.click();
    }


    public void waitClickElement(WebElement element){
        //driverWait.until(ExpectedConditions.elementToBeClickable(element));
    }




}
