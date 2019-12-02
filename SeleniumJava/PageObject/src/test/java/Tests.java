import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class Tests extends  WebDriverConfig{
    GooglePage page;

    @Test
    public void StartSerch(){
        page = new GooglePage(webDriver);
        page.driver.get("");

        page.Search("Тётка" + Keys.ENTER);
        Assert.assertEquals("Tётка", "Tётка");
    }



}
