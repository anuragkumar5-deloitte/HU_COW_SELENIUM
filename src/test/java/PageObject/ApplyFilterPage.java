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

    public void ClickLogin() throws InterruptedException {
        WebElement loginBtnClick = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
        loginBtnClick.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void Login() throws InterruptedException {
        WebElement userName = driver.findElement(By.xpath("//input[@id='formBasicUsername']"));
        userName.sendKeys("ayurai");
        WebElement password = driver.findElement(By.xpath("//input[@id='formBasicPassword']"));
        password.sendKeys("123456");
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='formBasicCheckbox']"));
        checkBox.click();
        WebElement loginBtnClick = driver.findElement(By.xpath("//button[@type='submit']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click()", loginBtnClick);
        Thread.sleep(2000);
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
        Select Desk = new Select(typeBtnClick);
        Desk.selectByValue("largedesk");
    }

    public void SelectLocation() throws InterruptedException {
        WebElement locationBtnClick = driver.findElement(By.xpath("(//*[@class='form-select'])[2]"));
        locationBtnClick.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Select Location = new Select(locationBtnClick);
        Location.selectByValue("Gurugram");
    }

    public void ValidateDesk() throws InterruptedException {
        WebElement msg = driver.findElement(By.xpath("//strong[@style='float: right;']"));
        String text = msg.getText();
        String expectedText = "largedesk";
        Assert.assertEquals(text, expectedText);
        Thread.sleep(2000);
        WebElement bookBtnClick = driver.findElement(By.xpath("//*[@href='/spacedetails/3']"));
        bookBtnClick.click();
        Thread.sleep(2000);
    }

}