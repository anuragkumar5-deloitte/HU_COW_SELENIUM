package PageObject;


import Resources.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class UserLogin extends Base {
//    WebDriver driver;
//
//    public UserLogin(WebDriver driver){
//        this.driver = driver;
//    }

//    public void clickLogin() throws InterruptedException {
//        WebElement loginBtnClick = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
//        loginBtnClick.click();
//        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
//    }
    public void enterUserNAme() throws InterruptedException {
        WebElement userName = driver.findElement(By.xpath("//input[@id='formBasicUsername']"));
        userName.sendKeys("johndoe");
        Thread.sleep(1000);
    }
    public void enterPassword() throws InterruptedException {
        WebElement password = driver.findElement(By.xpath("//input[@id='formBasicPassword']"));
        password.sendKeys("john123");
        Thread.sleep(1000);
    }
    public void clickCheckBox(){
        WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"formBasicCheckbox\"]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",checkBox);
    }
    public void clickUserLogin() throws InterruptedException {
        WebElement loginBtnClick = driver.findElement(By.xpath("//div[@class='form-container']/child::form/child::div[@class='d-grid']/child::button"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        //js.executeScript("arguments[0].click()",loginBtnClick);
        loginBtnClick.click();
        Thread.sleep(2000);

    }

}
