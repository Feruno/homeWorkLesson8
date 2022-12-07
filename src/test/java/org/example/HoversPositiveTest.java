package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class HoversPositiveTest {
    ChromeDriver webDriberHov;
    Hovers hover;

    @Test
    public void checkHov() {
        webDriberHov = new ChromeDriver();
        hover = new Hovers(webDriberHov);

        String userSelected= "name: user2";
        String res = hover.actionsGetAct(userSelected);

        Assert.assertEquals(res, userSelected);
        System.out.println("Найденная пользователь " +res + " Введенный пользователь  =  "+userSelected);
    }
}
