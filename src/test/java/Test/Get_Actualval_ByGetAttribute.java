package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Actualval_ByGetAttribute {
        public static void main(String args[])
        {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://demo.opencart.com/index.php?route=account/login");
            driver.findElement(By.name("email")).sendKeys("aditi123@gmail.com");

            String ActualValue = driver.findElement(By.name("email")).getAttribute("value");

            if(ActualValue.equals("aditi123@gmail.com"))
            {
                System.out.println("Testcase is Passed");
            }
            else
            {
                System.out.println("Testcase is Failed");
            }

        }
    }


