package TestCases;

import PageObject.UserLogin;
import org.testng.annotations.Test;



public class UserLoginTest extends Base {
    UserLogin userLog  = new UserLogin();

//    @BeforeTest
//    public void setUp(){
//        driverCreation();
//        userLog = new UserLogin();
//    }

//    @Test(priority = 1)
//    public void clickLoginTest() {
//        try {
//            userLog.clickLogin();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
    @Test(priority = 8)
    public void enterUserNameTest(){
        System.out.println("User puts their respective username");

        try{
            userLog.enterUserNAme();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test(priority = 9)
    public void enterPasswordTest(){
        System.out.println("User puts their respective password");
        try{
            userLog.enterPassword();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test(priority = 10)
    public void validateClickCheckBox(){
        try{
            userLog.clickCheckBox();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test(priority = 11)
    public void clickUserLoginTest(){
        try{
            userLog.clickUserLogin();
            System.out.println("User gets logged in");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
