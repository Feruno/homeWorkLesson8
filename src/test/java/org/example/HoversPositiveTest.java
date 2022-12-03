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

        hover.actionsGetAct();
        hover.findUser();

    }
}
