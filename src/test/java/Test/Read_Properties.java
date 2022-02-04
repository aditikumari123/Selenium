package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Properties {
    public static void main(String args[]) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        Properties Prop = new Properties();
        FileInputStream fl = new FileInputStream("C:\\Users\\DELL\\testing\\src\\test\\java\\Testdata.properties");
        Prop.load(fl);

        System.out.println(Prop.getProperty("url"));
        String vURL = Prop.getProperty("url");
        String vUsername = Prop.getProperty("username");
        driver.get(vURL);

        WebElement objusername = driver.findElement(By.name(Prop.getProperty("locusername")));
        //driver.findElement(By.name("email")).sendKeys(vUsername);
        objusername.sendKeys(vUsername);

        FileOutputStream op = new FileOutputStream("C:\\Users\\DELL\\testing\\src\\test\\java\\Testdata.properties");
        Prop.setProperty("password","veju");
        Prop.store(op,"comments");
    }
}

