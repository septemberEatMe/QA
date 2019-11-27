import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
    ChromeDriver chrome;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "d:/driver2/chromedriver.exe");
        chrome = new ChromeDriver();
    }


}
