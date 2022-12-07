package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyPressesTest {

    ChromeDriver webDriberKeyPresses;
    KeyPresses keyPresses;

    @Test
    public void checkKeyPresses() {
        webDriberKeyPresses = new ChromeDriver();
        keyPresses = new KeyPresses(webDriberKeyPresses);

        String charPress = "LEFT";

        keyPresses.clickFieldAndPressSpecButton(charPress);

        String feedBack = keyPresses.checkChar(charPress);
        Assert.assertEquals( feedBack, charPress);
        System.out.println("Полученный символ: " + feedBack + " введенный символ = " + keyPresses.showKey() );
    }
}
