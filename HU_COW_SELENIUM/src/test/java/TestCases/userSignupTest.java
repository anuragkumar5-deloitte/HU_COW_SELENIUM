package TestCases;
import org.testng.annotations.Test;
import PageObject.userSignUp;
import Resources.Base;

public class userSignupTest extends Base {
    userSignUp signup = new userSignUp() ;
    @Test(priority = 7)
    public void validateSignup(){
        try {
            signup.signUp();
            Thread.sleep(2000);
        }catch(Exception e) {
            System.out.println("cannot click on signup button"+e.getMessage());
        }
        try {
            signup.enterName();
            Thread.sleep(2000);
        }catch(Exception e) {
            System.out.println("unable to enter name"+e.getMessage());
        }
        try {
            signup.enterUserName();
            Thread.sleep(2000);
        }catch(Exception e) {
            System.out.println("unable to enter username"+e.getMessage());
        }
        try {
            signup.enterPassword();
            Thread.sleep(2000);
        }catch(Exception e) {
            System.out.println("unable to enter password"+e.getMessage());
        }
        try {
            signup.enterContact();
            Thread.sleep(2000);
        }catch(Exception e) {
            System.out.println("unable to enter contact"+e.getMessage());
        }
        try {
            signup.enterEmail();
            Thread.sleep(2000);
        }catch(Exception e) {
            System.out.println("unable to enter email"+e.getMessage());
        }
        try {
            signup.enterOrgMail();
            Thread.sleep(2000);
        }catch(Exception e) {
            System.out.println("unable to enter organization mail"+e.getMessage());
        }
        try {
            signup.enterDate();
            Thread.sleep(2000);
        }catch(Exception e) {
            System.out.println("unable to enter date"+e.getMessage());
        }
        try {
            signup.clickCheckBox();
            Thread.sleep(2000);
        }catch(Exception e) {
            System.out.println("unable to click on checkbox"+e.getMessage());
        }
        try{
            signup.clickSubmit();
            Thread.sleep(2000);

        } catch (Exception e) {
            System.out.println("error while clicking on submit button"+e.getMessage());
        }
    }
}
