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
        int resAddElem = addRemoveElem.quantityButtons();
        Assert.assertEquals(resAddElem, numElements);

        System.out.println("Число добавленных кнопок на страницу = " + resAddElem + " Введенное число = "+numElements);

    }
}
