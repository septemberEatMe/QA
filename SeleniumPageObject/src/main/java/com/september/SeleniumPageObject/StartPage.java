package com.september.SeleniumPageObject;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.serviceworker.model.RegistrationID;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.september.SeleniumPageObject.SignUp.Register;

public class StartPage extends WebDriverSettings{
	
	@Test
	public void firstTest() {
		Register reg = PageFactory.initElements(driver, Register.class);
		reg.open();
		reg.enterSearch("QA junior");
		reg.clickSubmit();
	}

}
