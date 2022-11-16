package org.example;

import org.testng.annotations.Test;

import java.rmi.registry.Registry;

// extends keyword is used to inherit child class(TestSuite ) from parent class(BaseTest)
public class TestSuite extends BaseTest {
   HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    //RegisterPage registerPage =new RegisterPage();
    // testing annotations method
    @Test
    public void userShouldAbleToRegisterSuccessfully(){

       homePage.verifyRegisterButton();
        registerPage.verifyUserIsOnRegisterPage();
        registerPage.enterRegistrationDetails();
        registerResultPage.verifyUserRegisteredSuccessfully();


    }
}
