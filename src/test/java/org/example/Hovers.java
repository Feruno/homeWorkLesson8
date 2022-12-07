package org.example;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;


public class Hovers {
    private WebDriver webDriberHov;
    private final String URI = "http://the-internet.herokuapp.com/hovers";

    public Hovers(WebDriver webDriver) {
        this.webDriberHov = webDriver;
        webDriver.get(URI);
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(xpath = "//div[@class='figure'][2]")
    public WebElement hoversFigure;
    @FindBy(xpath = "//div[@class='figcaption']")
    public WebElement clickText;


    public String actionsGetAct(String userNname) {
        Actions act = new Actions(webDriberHov);
        act.moveToElement(hoversFigure).perform();
        String resultPText = $(hoversFigure).shouldHave(Condition.text(userNname)).getText();

        System.out.println("Полученный текст = "+ resultPText);

        return resultPText.substring(0,11);

    }

}
