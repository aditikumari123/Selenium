package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement_Exception {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");

        WebElement username = driver.findElement(By.name("email"));
//        WebElement username = driver.findElement(By.name("emailss"));
        username.sendKeys("Aditi");

        driver.navigate().refresh();
        Thread.sleep(5000);
        username.sendKeys("Nisha");
    }
}
