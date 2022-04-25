package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class ApplyFilterPage {
    WebDriver driver;

    public ApplyFilterPage(WebDriver driver) {
        this.driver = driver;
    }


    public void ClickExplore() throws InterruptedException {
        WebElement exploreBtnClick = driver.findElement(By.xpath("//*[@class='navlink']"));
        exploreBtnClick.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void SelectTypes() throws InterruptedException {
        WebElement typeBtnClick = driver.findElement(By.xpath("//*[@class='form-select']"));
        typeBtnClick.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(2000);
        Select Desk = new Select(typeBtnClick);
        Desk.selectByValue("largedesk");
    }

    public void SelectLocation() throws InterruptedException {
        WebElement locationBtnClick = driver.findElement(By.xpath("(//*[@class='form-select'])[2]"));
        locationBtnClick.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(2000);
        Select Location = new Select(locationBtnClick);
        Location.selectByValue("Gurugram");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
    }

    public void ValidateDesk() throws InterruptedException {
        WebElement msg = driver.findElement(By.xpath("//p[normalize-space()='Gurugram']"));
        String text = msg.getText();
        String expectedText = "Gurugram";
        Assert.assertEquals(text, expectedText);
        Thread.sleep(2000);
        WebElement bookBtnClick = driver.findElement(By.xpath("//*[@href='/spacedetails/3']"));
        bookBtnClick.click();
        Thread.sleep(2000);
    }

}