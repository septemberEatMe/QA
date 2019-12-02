import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
/*
* Класс конфиг для веб - драйвера DRY
*
* */
public class WebDriverConfig {
    WebDriver webDriver;
    WebDriverWait wait;

    @Before
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "d:/driver2/chromedriver.exe");
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(webDriver, 30);
    }

    @After
    public void EndTest(){
        webDriver.quit();
    }
}
