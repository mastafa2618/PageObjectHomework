// A package in java is used to group related classes
package org.example;

// importing a package in selenium of ChromeDriver
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// extends keyword is used to inherit child class(DriverManager) from parent class(Utils)
public class DriverManager extends Utils{

    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");
        // setProperty command is used for sets the property of the system which is indicated by a key
        driver = new ChromeDriver();
        // to complete test scripts with Google Chrome
        driver.manage().window().maximize();  // To maximize the browser

        // .get() method is used to open Url and it will wait till whole page gets loaded
        driver.get("https://demo.nopcommerce.com/");

    }



}
