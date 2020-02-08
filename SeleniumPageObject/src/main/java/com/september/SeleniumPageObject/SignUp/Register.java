package com.september.SeleniumPageObject.SignUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.september.SeleniumPageObject.WebDriverSettings;

public class Register {
	private WebDriver driver;
	private WebDriverWait wait;
	
	public Register(WebDriver driver) {
		this.driver = driver; 
		driver.manage().window().fullscreen();
		this.wait = new WebDriverWait(driver, 1);
	}
	
	public void open() {
		driver.get("https://spb.hh.ru/search/vacancy?area=2");
	}
	
	@FindBy(css =".bloko-input-wrapper .bloko-input")
	public WebElement search;
	
	@FindBy(className = "supernova-search-group__submit")
	public WebElement findButton;
	
	public void enterSearch(String req) {
		search.sendKeys(req);
	}
	
	public void clickSubmit() {
		findButton.click();
	}
	
	
}
