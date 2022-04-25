package TestCases;
import Resources.Base;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObject.ApplyFilterPage;
public class ApplyFilterTest extends Base {
    PageObject.ApplyFilterPage userLog;

    @BeforeTest
    public void setUp() {
        driverCreation();
        userLog = new ApplyFilterPage(driver);
    }

    @Test(priority = 1)
    public void ClickLoginTest() {
        try {
            userLog.ClickLogin();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test(priority = 2)
    public void LoginTest(){
        try{
            userLog.Login();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 3)
    public void ClickExploreTest() {
        try {
            userLog.ClickExplore();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 4)
    public void SelectTypesTest() {
        try {
            userLog.SelectTypes();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 5)
    public void SelectLocationTest() {
        try {
            userLog.SelectLocation();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
