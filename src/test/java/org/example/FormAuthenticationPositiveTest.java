package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormAuthenticationPositiveTest {
    ChromeDriver webDriber;
    FormAuthentication authent;

    @Test
    public void checkA() {
        webDriber = new ChromeDriver();
        authent = new FormAuthentication(webDriber);

        String login = "tomsmith";
        String password = "SuperSecretPassword!";

        authent.fillLoginAndPassword(login, password);
        System.out.println("login " + login + " pass " + password);

        authent.clickButton();

        authent.waitClickElement(authent.buttonLoginInput);

        String feedBack = authent.titleFeedBack.getText();
        Assert.assertNotNull("You logged into a secure area!", feedBack);
        System.out.println("Полученное сообщение: " + feedBack);
    }
}
