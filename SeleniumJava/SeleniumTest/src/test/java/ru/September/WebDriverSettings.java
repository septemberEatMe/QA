package ru.September;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {

    public ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "d:\\driver2\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Драйвер запущен ");
    }
    @After
    public void close(){
        driver.quit();
    }
}
