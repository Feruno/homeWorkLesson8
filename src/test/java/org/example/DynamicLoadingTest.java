package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicLoadingTest {
    ChromeDriver webDriverDl;
    DynamicLoading DynamicLoadingWebDri;

    @Test
    public void checkDynamicLoading() {
        webDriverDl = new ChromeDriver();
        DynamicLoadingWebDri = new DynamicLoading(webDriverDl);

        DynamicLoadingWebDri.buttonClick();
        DynamicLoadingWebDri.waitLoad();

        Assert.assertNotNull("Hello World!", DynamicLoadingWebDri.waitLoad());
        System.out.println("Полученное сообщение: " + DynamicLoadingWebDri.waitLoad());
    }
}
