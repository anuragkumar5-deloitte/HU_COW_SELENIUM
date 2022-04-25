package TestCases;


import PageObject.adminPage;
import Resources.Base;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class adminTest extends Base {
    adminPage admin=new adminPage();;

//    @BeforeMethod
//    public void setup() throws IOException {
//        driverCreation();
//        admin=new adminPage(driver);
//
//
//    }
    @Test(priority = 18)
    public void adminScenarioTest() throws InterruptedException {
//        admin.visitAdminPage();
        admin.fillAddSpaceForm();
//        driver.close();

    }



    @Test(priority = 19)
    public void addSpaceBtnTest() throws InterruptedException {
//        admin.visitAdminPage();
        admin.clickAddSpace();
//        driver.close();

    }

    @Test(priority = 20)
    public void totalSpaceBtnTest() throws InterruptedException {
//        admin.visitAdminPage();
        admin.clickTotalSpace();
//        driver.close();

    }


    @Test(priority = 21)
    public void bookedSpaceBtnTest() throws InterruptedException {
//        admin.visitAdminPage();
        admin.clickBookedSpace();
//        driver.close();

    }



}

