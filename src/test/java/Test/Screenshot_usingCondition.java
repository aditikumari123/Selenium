package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Screenshot_usingCondition {
    public static void main(String args[]) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();

        List<WebElement> lst = driver.findElements(By.name("q"));

        if(lst.size()==1)
        {
            System.out.println("Testcase Passed");
        }
        else
        {
            System.out.println("Testcase is failed");

            TakesScreenshot st = ((TakesScreenshot) driver);
            File src = st.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src,new File("E:\\Screenshot2.png"));
        }
    }
}
