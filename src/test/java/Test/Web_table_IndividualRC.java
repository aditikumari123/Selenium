package Test;

import com.sun.deploy.cache.BaseLocalApplicationProperties;
import com.sun.deploy.config.Config;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Web_table_IndividualRC {

    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("E:\\WbTable.html");
        driver.manage().window().maximize();
//       // System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[1]")).getText());
//        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[1]")).getText());
//        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText());
//        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[1]")).getText());
//        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]")).getText());
        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[1]")).getText());
        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]")).getText());

    }
}
