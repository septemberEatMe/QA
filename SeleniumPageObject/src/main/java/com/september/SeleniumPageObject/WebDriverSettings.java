package com.september.SeleniumPageObject;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings{
	
	public WebDriver driver;
	//Конфигурация для перед началом каждого теста.
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
}
