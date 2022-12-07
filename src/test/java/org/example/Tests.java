package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {
    WebDriver webDriver;

    @Before
    public void openBrowser() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @Test
    public void checkDynamicLoading() {
        DynamicLoading DynamicLoadingWebDri;

        DynamicLoadingWebDri = new DynamicLoading(webDriver);

        DynamicLoadingWebDri.buttonClick();
        DynamicLoadingWebDri.waitLoad();

        Assert.assertNotNull("Hello World!", DynamicLoadingWebDri.waitLoad());
        System.out.println("Полученное сообщение: " + DynamicLoadingWebDri.waitLoad());
    }

    @Test
    public void checkKeyPresses() {
        KeyPresses keyPresses;
        keyPresses = new KeyPresses(webDriver);

        String charPress = "LEFT";

        keyPresses.clickFieldAndPressSpecButton(charPress);

        String feedBack = keyPresses.checkChar(charPress);
        Assert.assertEquals( feedBack, charPress);
        System.out.println("Полученный символ: " + feedBack + " введенный символ = " + keyPresses.showKey() );
    }


    @Test
    public void checkHov() {
        Hovers hover;
        hover = new Hovers(webDriver);

        String userSelected = "name: user2";
        String res = hover.actionsGetAct(userSelected);

        Assert.assertEquals(res, userSelected);
        System.out.println("Введенное имя пользвателя  =  " + userSelected + " Полученное имя пользвателя " + res);
    }


    @Test
    public void checkAuthenticationNegativeTestLogin() {
        FormAuthentication authent;
        authent = new FormAuthentication(webDriver);

        String login = "wrongLogin";
        String password = "SuperSecretPassword!";

        authent.fillLoginAndPassword(login, password);
        System.out.println("login " + login + " pass " + password);

        authent.clickButton();


        String feedBack = authent.titleFeedBack.getText();
        Assert.assertNotNull("Your username is invalid!", feedBack);
        System.out.println("Полученное сообщение: " + feedBack);
    }


    @Test
    public void checkAuthenticationNegativeTestPassword() {
        FormAuthentication authent;
        authent = new FormAuthentication(webDriver);

        String login = "tomsmith";
        String password = "wrongPassword";

        authent.fillLoginAndPassword(login, password);
        System.out.println("login " + login + " pass " + password);

        authent.clickButton();

        String feedBack = authent.titleFeedBack.getText();
        Assert.assertNotNull("Your password is invalid!", feedBack);
        System.out.println("Полученное сообщение: " + feedBack);
    }


    @Test
    public void checkAuthenticationPositiveTest() {
        FormAuthentication authent;
        authent = new FormAuthentication(webDriver);

        String login = "tomsmith";
        String password = "SuperSecretPassword!";

        authent.fillLoginAndPassword(login, password);
        System.out.println("login " + login + " pass " + password);

        authent.clickButton();

        String feedBack = authent.titleFeedBack.getText();
        Assert.assertNotNull("You logged into a secure area!", feedBack);
        System.out.println("Полученное сообщение: " + feedBack);
    }


    @Test
    public void checkCheckboxes() {
        Checkboxes checkboxes;
        checkboxes = new Checkboxes(webDriver);

        checkboxes.clickCheckbox();
        System.out.println("Выбран ли Checkbox:  " + checkboxes.checkStatusCheckbox());
    }

    @Test
    public void checkAddRemoveElements() {
        AddRemoveElements addRemoveElem;
        addRemoveElem = new AddRemoveElements(webDriver);

        int numElements = 10;

        addRemoveElem.countElements(numElements);
        int resAddElem = addRemoveElem.quantityButtons();
        Assert.assertEquals(resAddElem, numElements);

        System.out.println("Число добавленных кнопок на страницу = " + resAddElem + " Введенное число = "+numElements);

    }


    @After
    public void closeBrowser() {
        if (webDriver != null) {
            webDriver.close();
        }
    }
}
