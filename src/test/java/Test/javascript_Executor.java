package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


@Test
public class javascript_Executor {
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
        //System.out.println(System.getProperty("user.dir"));
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        System.out.println("Setup completed");

        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(document.body.scrollHeight,0)");

    }
}
