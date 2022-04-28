package TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObject.adminSignUp;
import Resources.Base;

public class AdminSignupTest extends Base {
    adminSignUp signup = new adminSignUp() ;

//    @BeforeTest
//    public void setUp(){
//        driverCreation();
//        signup = new adminSignUp();
//    }
    @Test(priority = 19)
    public void validateAdminSignup(){
        try {
            signup.clickLogin();
            Thread.sleep(1000);
        }catch(Exception e) {
            System.out.println("cannot click on login button"+e.getMessage());
        }
        try {
            signup.adminsigninBtn();
            Thread.sleep(1000);
        }catch(Exception e) {
            System.out.println("cannot click on admin signin button"+e.getMessage());
        }
        try {
            signup.enterName();
            Thread.sleep(1000);
        }catch(Exception e) {
            System.out.println("unable to enter name"+e.getMessage());
        }
        try {
            signup.enterUserName();
            Thread.sleep(1000);
        }catch(Exception e) {
            System.out.println("unable to enter username"+e.getMessage());
        }
        try {
            signup.enterPassword();
            Thread.sleep(1000);
        }catch(Exception e) {
            System.out.println("unable to enter password"+e.getMessage());
        }
        try {
            signup.enterContact();
            Thread.sleep(1000);
        }catch(Exception e) {
            System.out.println("unable to enter contact"+e.getMessage());
        }
        try {
            signup.enterEmail();
            Thread.sleep(1000);
        }catch(Exception e) {
            System.out.println("unable to enter mail"+e.getMessage());
        }
        try {
            signup.enterDate();
            Thread.sleep(1000);
        }catch(Exception e) {
            System.out.println("unable to enter date"+e.getMessage());
        }
        try {
            signup.enterBio();
            Thread.sleep(1000);
        }catch(Exception e) {
            System.out.println("unable to enter bio"+e.getMessage());
        }
        try {
            signup.clickSubmit();
            Thread.sleep(1000);
        }catch(Exception e) {
            System.out.println("unable to click on submit"+e.getMessage());
        }
        try{
            signup.loginBtn();
            Thread.sleep(1000);
//            signup.enterUserName();
//            signup.enterPassword();
//            signup.ownerLogin();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
