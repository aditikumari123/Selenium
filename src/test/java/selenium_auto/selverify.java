package selenium_auto;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class selverify {
    public WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
        //System.out.println(System.getProperty("user.dir"));
        driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        System.out.println("Setup completed");

    }

    @AfterMethod
    public void exit(){
        driver.quit();
        System.out.println("get exit");
    }

    @Test(priority = 1)
    public void Text(){
        String val = driver.findElement(By.xpath("//a[normalize-space()='Your Store']")).getText();
        Assert.assertEquals(val,"Your Store");
        System.out.println("Test Case Passed");

    }

    @Test(priority = 2,dependsOnMethods = {"Text"})
    public void login(){
        driver.findElement(By.xpath("//span[@class='caret']")).click();
        driver.findElement(By.linkText("Login")).click();
        System.out.println("Login Test Case Passed");
    }

}

