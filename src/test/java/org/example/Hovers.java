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

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Hovers {
    private WebDriver webDriberHov;

    private WebDriverWait driverWait;
    private final String URI = "http://the-internet.herokuapp.com/hovers";

    private final int TIMEOUT = 30;



    public Hovers(WebDriver webDriver) {
        this.webDriberHov = webDriver;
        webDriver.get(URI);
        // driverWait = new WebDriverWait(webDriver, TIMEOUT, 500);
        PageFactory.initElements(webDriver, this);
    }


    @FindBy(xpath = "//div[@class='figure'][2]")
    public WebElement hoversFigure;

    @FindBy(xpath = "//div[@class='figcaption']")  //figure  figcaption
    public WebElement clickText;


    public void actionsGetAct() {
        Actions act = new Actions(webDriberHov);
        act.moveToElement(hoversFigure).perform();
        webDriberHov.findElements(By.tagName("h5"));

        String feedBack = clickText.getText();
        Assert.assertNotNull("name: user", feedBack);
        System.out.println("Полученное сообщение: " + feedBack);
        //hoversFigure.click();
    }

    public void findUser(){
        //WebElement element = new WebDriverWait(webDriberHov, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5")));
        WebElement element = new WebDriverWait(webDriberHov, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a")));
        System.out.println("пользователь " + element);
        //$$("#figure").shouldHave(CollectionCondition.size(3));
        //$("#figure").shouldHave(Condition.text("name: user1"));
    }


}
