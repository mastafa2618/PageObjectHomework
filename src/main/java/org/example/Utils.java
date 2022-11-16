// A package in java is used to group related classes
package org.example;

// importing a package in selenium.By
import org.openqa.selenium.By;
// importing a package in selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.ExpectedConditions;
// importing a package in selenium.support.ui.Select
import org.openqa.selenium.support.ui.Select;
// importing a package in selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.WebDriverWait;
//importing java.text.SimpleDateFormat
import java.text.SimpleDateFormat;
// im[porting java.time.Duration
import java.time.Duration;

// extends keyword is used to inherit child class(Utils) from parent class(BasePage)
public class Utils extends BasePage  {

    // findElement command is used to uniquely identify a web element within the page
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }
    // verifying message, error, asserting WebElements and many more.
    // to input content in editable text fields or password field in a webpage.
    public static void typeText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by)
    {

       return driver.findElement(by).getText();

    }
    // method written as getTimeStamp
    public static String getTimeStamp()
    {
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        // printing output for timeStamp
        return timeStamp;
    }
    public static void selectFromDropdownByVisibleText(By by,String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static void selectFromDropDownByValue(By by,String text){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }
    public static void selectFromDropDownByIndex(By by,int num)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(num);

    }

    public void WaitForElementToBeClickable(By by,int duration)
    {


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

        wait.until(ExpectedConditions.elementToBeClickable(by));

    }
    public void WaitForElementToBeVisible(By by,int duration)
    {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }

    public void WaitForUrlTobe(String url,int duration) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
         wait.until(ExpectedConditions.urlToBe(url));
    }



}
