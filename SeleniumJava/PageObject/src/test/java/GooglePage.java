import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(name = "q")
    private WebElement inputSerch;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        driver.get("http://www.google.com");

        //TODO PaGEfACTORY - ???
        PageFactory.initElements(driver, this);
    }

    public void Search(String text){
        inputSerch.sendKeys(text + Keys.ENTER);
        inputSerch.click();
    }


}
