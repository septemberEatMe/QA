import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

//
public class MainPage {
    public WebDriver webDriver;
    public WebDriverWait wait;
    @FindBy(id = "q")
    WebElement googleSearch;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, 30);

        PageFactory.initElements(webDriver, this);
    }


    public void SwitcSearchToTitle(){
        googleSearch.click();
    }
}