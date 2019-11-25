package ru.September;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass extends WebDriverSettings{

    @Test
    public void firstTest(){
        driver.get("http://www.google.com");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Google"));
    }


}
