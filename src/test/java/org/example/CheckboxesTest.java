package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesTest {
    ChromeDriver webDriberCheckboxes;
    Checkboxes checkboxes;

    @Test
    public void checkCheckboxes() {
        webDriberCheckboxes = new ChromeDriver();
        checkboxes = new Checkboxes(webDriberCheckboxes);

        checkboxes.clickCheckbox();
        System.out.println("Выбран ли Checkbox:  " + checkboxes.checkStatusCheckbox());
    }
}
