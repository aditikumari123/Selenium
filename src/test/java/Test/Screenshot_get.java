package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot_get {
    public static void main(String argg[]) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://sellglobal.ebay.in/seller-center/");
        driver.manage().window().maximize();

        TakesScreenshot st = ((TakesScreenshot) driver);
        File src = st.getScreenshotAs(OutputType.FILE);

//        File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("E:\\Screenshot.png"));
    }
}
