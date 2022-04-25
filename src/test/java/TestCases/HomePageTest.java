package TestCases;

import Resources.Base;
import PageObject.HomePage;
import org.testng.annotations.*;

public class HomePageTest extends Base {
    HomePage home ;
    @BeforeClass
    public void Before_Test() throws InterruptedException {
        driverCreation();
        home = new HomePage(driver);
        Thread.sleep(3000);

    }
    @Test(priority = 0)
    public void Home_page() throws InterruptedException {
        HomePage page = new HomePage(driver);
        page.explore(driver);
        Thread.sleep(3000);
    }
    @Test(priority = 1)
    public void About_Home_Page() throws InterruptedException {
        HomePage page = new HomePage(driver);
        page.about(driver);
        Thread.sleep(3000);

    }
    @Test(priority = 2)
    public void Home_page_Hot_Seats() throws InterruptedException {
        HomePage page = new HomePage(driver);
        page.Hot_Seats(driver);
        Thread.sleep(3000);

    }
    @Test(priority = 3)
    public void Home_page_Large_Desk() throws InterruptedException {
        HomePage page = new HomePage(driver);
        page.Large_Desk(driver);
        Thread.sleep(3000);
    }
    @Test(priority = 4)
    public void Home_Page_cabin() throws InterruptedException {
        HomePage page = new HomePage(driver);
        page.cabin(driver);
        Thread.sleep(3000);
    }
    @Test(priority = 5)
    public void Home_page_Book_Now() throws InterruptedException {
        HomePage page = new HomePage(driver);
        page.Book_Now(driver);
        Thread.sleep(3000);
    }
    @Test(priority = 6)
    public void Home_page_Arrow_Right(){
        HomePage page = new HomePage(driver);
        try {
            page.Arrow_Right(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void After_Test(){
        driver.close();

    }
}