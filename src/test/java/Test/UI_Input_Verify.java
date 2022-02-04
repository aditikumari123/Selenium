package Test;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.core5.http.HttpResponse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class UI_Input_Verify {
    public WebDriver driver;

    @Test
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
        //System.out.println(System.getProperty("user.dir"));
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//Implicit wait
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println("Setup completed");


        driver.manage().window().maximize();
        driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();
        driver.findElement(By.xpath("//button[text()='Start']")).click();
        Thread.sleep(50);//Static Wait
        WebDriverWait wait = new WebDriverWait(driver,30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Hello World!']")));//explicit wait
        System.out.println(driver.findElement(By.xpath("//*[text()='Hello World!']")).getSize());

        List<WebElement> lst = driver.findElements(By.xpath("//*[text()='Hello World!']"));
        System.out.println(lst.size());


//       driver.findElement(By.linkText("Inputs")).click();
//        driver.findElement(By.linkText("Dropdown")).click();
//        driver.findElement(By.id("dropdown")).sendKeys("Option 1");
//        driver.findElement(By.linkText("Checkboxes")).click();
//        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//        driver.findElement(By.name("//input[text()=' checkbox 1']")).click();
//        driver.findElement(By.linkText("Broken Images")).click();
//          driver.findElement(By.cssSelector("img"));




    }

}
