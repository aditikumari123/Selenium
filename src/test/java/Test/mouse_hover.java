package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class mouse_hover {

    @Test
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
        //System.out.println(System.getProperty("user.dir"));
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://sellglobal.ebay.in/seller-center/#");
        System.out.println("Setup completed");

        driver.manage().window().maximize();

        Actions act = new Actions(driver) ;
        act.moveToElement(driver.findElement(By.linkText("Seller Updates"))).build().perform();
    }

}
