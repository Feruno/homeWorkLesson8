package org.example;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
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


    public void actionsGetAct() {
        Actions act = new Actions(webDriberHov);
        act.moveToElement(hoversFigure).perform();
        webDriberHov.findElements(By.tagName("h5"));

        String feedBack = clickText.getText();
        Assert.assertNotNull("name: user", feedBack);
        System.out.println("Полученное сообщение: " + feedBack);

    }

    public void findUser(){

        WebElement element = new WebDriverWait(webDriberHov, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a")));
        System.out.println("пользователь " + element);
    }


}
