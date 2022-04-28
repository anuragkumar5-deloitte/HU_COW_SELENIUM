package TestCases;


import PageObject.adminPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class adminTest extends Base {
    adminPage admin ;//=new adminPage();

    @BeforeMethod
    public void setup() throws IOException {
        driverCreation();
        admin=new adminPage(driver);


    }
    @Test(priority = 21)
    public void adminScenarioTest() throws InterruptedException {
        admin.visitAdminPage();
        admin.fillAddSpaceForm();
       driver.close();

    }


    @Test(priority = 22)
    public void addSpaceBtnTest() throws InterruptedException {
        admin.visitAdminPage();
        admin.clickAddSpace();
        driver.close();

    }

    @Test(priority = 23)
    public void totalSpaceBtnTest() throws InterruptedException {
        admin.visitAdminPage();
        admin.clickTotalSpace();
        driver.close();
    }


    @Test(priority = 24)
    public void bookedSpaceBtnTest() throws InterruptedException {
        admin.visitAdminPage();
        admin.clickBookedSpace();
       // driver.close();

    }
}

