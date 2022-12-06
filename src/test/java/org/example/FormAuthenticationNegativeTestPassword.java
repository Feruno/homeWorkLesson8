package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormAuthenticationNegativeTestPassword {
    ChromeDriver webDriber;
    FormAuthentication authent;

    @Test
    public void checkA() {
        webDriber = new ChromeDriver();
        authent = new FormAuthentication(webDriber);

        String login = "tomsmith";
        String password = "wrongPassword";

        authent.fillLoginAndPassword(login, password);
        System.out.println("login " + login + " pass " + password);

        authent.clickButton();

        String feedBack = authent.titleFeedBack.getText();
        Assert.assertNotNull("Your password is invalid!", feedBack);
        System.out.println("Полученное сообщение: " + feedBack);
    }
}
