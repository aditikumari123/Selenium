package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Boolean_Clear_method {
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        driver.manage().window().maximize();

        Boolean Bol = driver.findElement(By.name("email")).isDisplayed();
        if(Bol)
        {
            System.out.println("Test case is passed and user name visible on the webpage");
        }
        else
        {
            System.out.println("Test case is failed and user name is not visible on the webpage");
        }
    }
}
