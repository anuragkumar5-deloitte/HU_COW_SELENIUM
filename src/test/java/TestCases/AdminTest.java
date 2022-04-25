package TestCases;

import PageObject.adminLogin;
import Resources.Base;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AdminTest extends Base {
    adminLogin adminLog;
    @BeforeTest
    public void setUp(){
        driverCreation();
        adminLog = new adminLogin(driver);
    }
    @Test
    public void validateAdminLogin(){
        try{
            adminLog.clickLogin();
            adminLog.adminsigninBtn();
            System.out.println("Admin gets logged in");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
