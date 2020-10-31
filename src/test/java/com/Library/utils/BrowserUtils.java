package com.Library.utils;

import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    private static WebDriverWait wait=new WebDriverWait(Driver.getDriver(),20);

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();//printa gde imamo gresku u kodu
        }
    }
}
