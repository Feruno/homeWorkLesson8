package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoading {
    private  WebDriver webDriverDL;
    private final String URI = "http://the-internet.herokuapp.com/dynamic_loading/2";

    public DynamicLoading(WebDriver webDriver) {
        this.webDriverDL = webDriver;
        webDriver.get(URI);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//button")
    public WebElement buttonStart;

    @FindBy(css = "#finish h4")
    public WebElement finishText;

    public void buttonClick(){
        buttonStart.click();
    }

    public String waitLoad(){
        WebElement element = new WebDriverWait(webDriverDL, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']")));
        finishText.getText();
        return element.getText();

    }
}
