package TestCases;


import PageObject.adminPage;
import Resources.Base;
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
    @Test
    public void adminScenario() throws InterruptedException {
        admin.visitAdminPage();
        admin.fillAddSpaceForm();
    }



}

