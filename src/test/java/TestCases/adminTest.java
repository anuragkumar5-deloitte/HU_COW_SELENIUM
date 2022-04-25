package TestCases;


import PageObject.adminPage;
import Resources.Base;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class adminTest extends Base {
    adminPage admin;

    @BeforeMethod
    public void setup() throws IOException {
        driverCreation();
        admin=new adminPage(driver);


    }
    @Test(priority = 1)
    public void adminScenarioTest() throws InterruptedException {
        admin.visitAdminPage();
        admin.fillAddSpaceForm();
        driver.close();
    }



    @Test(priority = 2)
    public void addSpaceBtnTest() throws InterruptedException {
        admin.visitAdminPage();
        admin.clickAddSpace();
        driver.close();

    }

    @Test(priority = 3)
    public void totalSpaceBtnTest() throws InterruptedException {
        admin.visitAdminPage();
        admin.clickTotalSpace();
        driver.close();

    }


    @Test(priority = 4)
    public void bookedSpaceBtnTest() throws InterruptedException {
        admin.visitAdminPage();
        admin.clickBookedSpace();
        driver.close();

    }



}

