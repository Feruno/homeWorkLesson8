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

        char charPress = ' ';

        keyPresses.clickFieldAndPressButton(charPress);
        String res = keyPresses.showKey();

        char feedBack = keyPresses.checkChar(charPress);
        Assert.assertNotNull(""+charPress+"", feedBack);
        Assert.assertNotNull(""+res+"", feedBack);
        System.out.println("Полученный символ: " + feedBack + " введенный символ = " + res );
    }
}
