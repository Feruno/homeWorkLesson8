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

        String res = String.valueOf(charPress);

        keyPresses.clickFieldAndPressButton(charPress);


        char feedBack = keyPresses.checkChar(charPress);
        Assert.assertNotNull(""+charPress+"", feedBack);
        Assert.assertNotNull(""+res+"", feedBack);
        Assert.assertEquals( String.valueOf(charPress), res);
        System.out.println("Полученный символ: " + feedBack + " введенный символ = " + keyPresses.showKey() );
    }
}
