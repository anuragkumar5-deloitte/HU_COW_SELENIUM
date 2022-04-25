package TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObject.adminSignUp;
import Resources.Base;

public class AdminSignupTest extends Base {
    adminSignUp signup ;

    @BeforeTest
    public void setUp(){
        driverCreation();
        signup = new adminSignUp();
    }
    @Test (priority = 17)
    public void validateAdminSignup(){
        try {
            signup.clickLogin();
        }catch(Exception e) {
            System.out.println("cannot click on login button"+e.getMessage());
        }
        try {
            signup.adminsigninBtn();
        }catch(Exception e) {
            System.out.println("cannot click on admin signin button"+e.getMessage());
        }
        try {
            signup.enterName();
        }catch(Exception e) {
            System.out.println("unable to enter name"+e.getMessage());
        }
        try {
            signup.enterUserName();
        }catch(Exception e) {
            System.out.println("unable to enter username"+e.getMessage());
        }
        try {
            signup.enterPassword();
        }catch(Exception e) {
            System.out.println("unable to enter password"+e.getMessage());
        }
        try {
            signup.enterContact();
        }catch(Exception e) {
            System.out.println("unable to enter contact"+e.getMessage());
        }
        try {
            signup.enterEmail();
        }catch(Exception e) {
            System.out.println("unable to enter mail"+e.getMessage());
        }
        try {
            signup.enterDate();
        }catch(Exception e) {
            System.out.println("unable to enter date"+e.getMessage());
        }
        try {
            signup.enterBio();
        }catch(Exception e) {
            System.out.println("unable to enter bio"+e.getMessage());
        }
        try {
            signup.clickSubmit();
        }catch(Exception e) {
            System.out.println("unable to click on submit"+e.getMessage());
        }
        try{
            signup.loginBtn();
//            signup.enterUserName();
//            signup.enterPassword();
//            signup.ownerLogin();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
