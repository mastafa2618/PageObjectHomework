package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
// extends keyword is used to inherit child class(BaseTest) from parent class(Utils)
public class BaseTest extends Utils {

    DriverManager driverManager = new DriverManager();

    @BeforeMethod     // Executes before method
    public void setUp(){
        driverManager.openBrowser();


    }

    @AfterMethod   // Executes after method
    public void tearDown(){
        driver.close();
    }
}
