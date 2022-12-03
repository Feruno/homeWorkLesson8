package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddRemoveElementsTest {
    ChromeDriver webDriberAddRemoveElem;
    AddRemoveElements addRemoveElem;

    @Test
    public void checkAddRemoveElements() {
        webDriberAddRemoveElem = new ChromeDriver();
        addRemoveElem = new AddRemoveElements(webDriberAddRemoveElem);

         int numElements = 10;

         addRemoveElem.countElements(numElements);
    }
}
