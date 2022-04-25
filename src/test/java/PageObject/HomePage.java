package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.FileNotFoundException;
import java.util.List;
import org.testng.Assert;
public class HomePage {


    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }
    public  void searchandclick(WebElement path){
        int i=1;
        while (i==1){
            try{
                path.click();
                i=0;
            }
            catch (Exception e){
                JavascriptExecutor jse = (JavascriptExecutor)this.driver;
                jse.executeScript("arguments[0].scrollIntoView()", path);
            }
        }
    }

    // Below are the locators

    By Explore = By.xpath("//*[text()='Explore']");
    By About = By.xpath("//*[text()='About']");
    By SearchInput= By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div/div/input");
    By HotSeats = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/section/div/div[1]/div/div/div[2]/div[2]/a");
    By LargeDesk = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/section/div/div[2]/div/div/div[2]/div[2]/a");
    By Cabin = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/section/div/div[3]/div/div/div[2]/div[2]/a");
    By BookNow = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/div/div[2]/div/div/div[3]/div/div/div/div/div/div[2]/a/p");
    By ArrowRight = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/div/div[1]/div[2]/i");
    By ArrowLeft = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[3]/div/div[1]/div[1]/i");

    public void explore(WebDriver driver) {
        driver.findElement(Explore).click();

    }
    public void about(WebDriver driver){
        driver.findElement(About).click();
    }
    public void Search_input(WebDriver driver){

        driver.findElement(SearchInput).click();
    }
    public  void Hot_Seats(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        searchandclick(driver.findElement(HotSeats));
        Thread.sleep(1000);
    }
    public  void Large_Desk(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        searchandclick(driver.findElement(LargeDesk));
        Thread.sleep(1000);
    }
    public  void cabin(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        searchandclick(driver.findElement(Cabin));
        Thread.sleep(1000);
    }
    public  void Book_Now(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        searchandclick(driver.findElement(BookNow));
        Thread.sleep(1000);
    }
    public  void Arrow_Right() {
        Assert.assertTrue(driver.findElement(ArrowRight).isEnabled());
    }
    public  void Arrow_Left(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        searchandclick(driver.findElement(ArrowLeft));
        Thread.sleep(1000);

    }
}
