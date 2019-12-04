import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfig {
    WebDriver google = null;

    @Before
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "d:/driver2/chromedriver.exe");
        google = ChromeDriver(
    }
}
