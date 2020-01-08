
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class TorrentRegistration extends ConfigSelenium {
    @Test
    public void search(){
        driver.get("https://infomania.biz/profile.php?mode=register");
        Random rand = new Random();

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("hacker" + rand.nextInt());

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("hacker" + rand.nextInt() + "@jopa.com");

        int password = rand.nextInt();
        WebElement pass = driver.findElement(By.id("pass"));
        pass.sendKeys("hacker" + password);

        WebElement passConfirm = driver.findElement(By.id("pass_confirm"));
        passConfirm.sendKeys("hacker" + password);

        WebElement post = driver.findElement(By.className("post"));
        post.sendKeys("4");

        WebElement captcha = driver.findElement(By.id("tp-captcha"));
        captcha.click();


    }
}
