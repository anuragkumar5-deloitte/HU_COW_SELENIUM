package TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObject.userSignUp;
import Resources.Base;

public class userSignupTest extends Base {
    userSignUp signup = new userSignUp();

//    @BeforeTest
//    public void setUp(){
//        driverCreation();
//        signup = new userSignUp();
//    }
    @Test(priority = 6)
    public void validateSignup(){
        try {
            signup.signUp();
        }catch(Exception e) {
            System.out.println("cannot click on signup button"+e.getMessage());
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
            System.out.println("unable to enter email"+e.getMessage());
        }
        try {
            signup.enterOrgMail();
        }catch(Exception e) {
            System.out.println("unable to enter organization mail"+e.getMessage());
        }
        try {
            signup.enterDate();
        }catch(Exception e) {
            System.out.println("unable to enter date"+e.getMessage());
        }
        try {
            signup.clickCheckBox();
        }catch(Exception e) {
            System.out.println("unable to click on checkbox"+e.getMessage());
        }
        try{
            signup.clickSubmit();

        } catch (Exception e) {
            System.out.println("error while clicking on submit button"+e.getMessage());
        }
    }
}
