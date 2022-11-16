//import org.example.Utils;
package org.example;
// importing selenium.By
import org.openqa.selenium.By;
import org.testng.Assert;
// extends keyword is used to inherit child class(RegisterResultPage ) from parent class(Utils)
public class RegisterResultPage extends Utils {


    String regMsg = "Your registration completed";

    public void verifyUserRegisteredSuccessfully(){
        // method to check the Url and expected one with the timeout parameter need to be provided the method
        WaitForUrlTobe("https://demo.nopcommerce.com/registerresult/1?returnUrl=/",10);
        // verifying messages, errors, asserting webelements and many more
        String regMsgg = getTextFromElement(By.className("result"));
        Assert.assertEquals(regMsg, regMsgg,"Your registration completed");


    }
}
