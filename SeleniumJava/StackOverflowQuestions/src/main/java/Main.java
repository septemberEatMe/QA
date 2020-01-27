import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.event.KeyEvent;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "d:\\driver2\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://stackoverflow.com/search?q=selenium+java");
        List<WebElement> questions = driver.findElements(By.className("question-hyperlink"));
        List<String> quste = new LinkedList<>();

        for(WebElement w : questions){
            quste.add(w.getAttribute("href"));
        }

        quste.forEach(e-> System.out.println(e));

    }
}
