package selenium_auto;

import org.testng.annotations.*;

public class Demo_test2 {

    @BeforeTest
    public void beforetest() {
        System.out.println("Executed before all the test files and Before execution of all demo classes");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("Executed after test");
    }
    @BeforeSuite
    public void beforesuite(){
        System.out.println("executed before suite");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("executed after suite");
    }

    @Test(priority = 1)
    public void open() {
        System.out.println("xyz");
    }
    @Test(priority = 2,enabled = false)
    public void avl()
    {
        System.out.println("hey");
    }

    @Test
    public void open2() {
        System.out.println("zyx");
    }
    }


