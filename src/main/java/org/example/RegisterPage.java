// importing in selenium.Utils
package org.example;
import org.example.Utils;
// importing a package in selenium.testng.Assert
import org.openqa.selenium.By;
// importing a package in selenium.
import org.testng.Assert;
// extends keyword is used to inherit child class(RegisterPage) from parent class(Utils)
public class RegisterPage extends Utils {

    // declared as private which can access the members of a class within the class itself but can't access outside the class
    // Initializes a new instance By.className
    //By.id for locate a particular web element using the value of its id attributes
    //*.xpath function for a built-in function of selenium webdriver which is used to locate elements
    String reg = "register";
    private By _registerIcon = By.className("ico-register");
    private By _genderfield = By.id("gender-male");
    private By _firstnamefield = By.id("FirstName");
    private By _lastnamefield = By.id("LastName");
    private By _dateOfBirthdaySelect = By.name("DateOfBirthDay");
    private By _dateOfBirthMonthSelect = By.name("DateOfBirthMonth");
    private By _dateOfBirthYearSelect = By.name("DateOfBirthYear");
    private By _emailField = By.id("Email");
    private By _companyNamefield = By.id("Company");
    private By _passwordlField = By.id("Password");
    private By _confirmPasswordField = By.id("ConfirmPassword");
    private By _clickOnregistrationButton = By.id("register-button");

    public void verifyUserIsOnRegisterPage(){
        Assert.assertEquals(reg, "register","Your registration completed");
    }
    public void enterRegistrationDetails(){
        // method simulates a mouse click on icoregister.
        clickOnElement(_registerIcon);
        //method simulates a mouse click on _genderfield.
        clickOnElement(_genderfield);
        // to input an editable text fields for (firstnamefield) in a webpage.
        typeText(_firstnamefield,"Mastafa");
        // to input an editable text fields for (lastnamefield) in a webpage.
        typeText(_lastnamefield,"Monoar");
        // to input an editable text fields for (_dateOfBirthdaySelect) in a webpage.
        selectFromDropdownByVisibleText(_dateOfBirthdaySelect,"14");
        // to input an editable text fields for (_dateOfBirthMonthSelect) in a webpage.
        selectFromDropdownByVisibleText(_dateOfBirthMonthSelect,"July");
        // to input an editable text fields for (_dateOfBirthYearSelect) in a webpage.
        selectFromDropdownByVisibleText(_dateOfBirthYearSelect,"1985");
        // to input an editable text fields for (emailField) in a webpage.

        typeText(_emailField,"mast"+getTimeStamp()+"@gmail.com");
        // to input an editable text fields for (companyNamefield) in a webpage.
        typeText(_companyNamefield,"UnicareLtd");
        // to input an editable text fields for (passwordlField) in a webpage.
        typeText(_passwordlField,"m147812");
        // to input an editable text fields for (confirmPasswordField) in a webpage.
        typeText(_confirmPasswordField,"m147812");
        // to input an editable text fields for (clickOnregistrationButton) in a webpage.
        clickOnElement(_clickOnregistrationButton);
    }
}
