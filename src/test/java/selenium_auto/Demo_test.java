package selenium_auto;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_test {

    @BeforeClass
    public void beforeclass(){
        System.out.println("Executed before class");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("Executed After class");
    }

    @Test(priority = 1)
    public void open() {
        System.out.println("xyz");
    }

    @Test(priority = 2,dependsOnMethods = {"open"})
    public void open2() {
        System.out.println("zyx");
    }

}
