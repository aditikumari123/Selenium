package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_CSSVal {
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");

        String cssvalue = driver.findElement(By.xpath("//input[@value='Login']")).getCssValue("background-color");
        System.out.println(cssvalue);

        String cssvalue1 = driver.findElement(By.xpath("//input[@value='Login']")).getCssValue("color");
        System.out.println(cssvalue1);

        driver.findElement(By.xpath("//input[@value='Login']")).submit();
    }
}
