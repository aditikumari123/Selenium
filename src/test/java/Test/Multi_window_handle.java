package Test;

import javafx.scene.effect.SepiaTone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class Multi_window_handle {
    public WebDriver driver;

    @Test
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        //System.out.println(System.getProperty("user.dir"));
        ChromeDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//Implicit wait
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println("Setup completed");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.linkText("Click Here")).click();
        String parent = driver.getWindowHandle();
        System.out.println(parent);
        Set<String> st = driver.getWindowHandles();
        Iterator<String> itr = st.iterator();
        while (itr.hasNext())
        {
            String childwindow = itr.next();
//            System.out.println(itr.next());
            if(!parent.equals(childwindow))
            {
                driver.switchTo().window(childwindow);
               // System.out.println(driver.findElement(By.xpath("//*[text()='New Window']")).getText());
                System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
            }
        }
    }
}