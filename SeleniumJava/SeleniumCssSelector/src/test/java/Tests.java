import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Tests extends Config {
    @Test
    public void FirstTest(){
        chrome.get("https://rozetka.com.ua");
        WebElement search = chrome.findElement(By.name("search"));
        search.sendKeys("Chivas Regal" + Keys.ENTER);

        WebElement btn = chrome.findElement(By.className("btn-link-i"));
        btn.click();

        WebElement cr = chrome.findElement(By.cssSelector(".g-i-tile-i-image.fix-height"));
        cr.click();

        for(int i = 0; i < 10; i++){
            cr.click();
        }
    }
}
