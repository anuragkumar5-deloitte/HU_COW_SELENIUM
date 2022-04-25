package PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class UserLogin {
    WebDriver driver;

    public UserLogin(WebDriver driver){
        this.driver = driver;
    }

    public void clickLogin() throws InterruptedException {
        WebElement loginBtnClick = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
        loginBtnClick.click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
    }
    public void enterUserNAme(){
        WebElement userName = driver.findElement(By.xpath("//input[@id='formBasicUsername']"));
        userName.sendKeys("ApurwaPrachi");
    }
    public void enterPassword(){
        WebElement password = driver.findElement(By.xpath("//input[@id='formBasicPassword']"));
        password.sendKeys("123");
    }
    public void clickCheckBox(){
        WebElement checkBox = driver.findElement(By.xpath("//*[contains(text(),'By creating an account you agree to the Terms and Conditions of Space Corp')]"));
        checkBox.click();
    }
    public void clickUserLogin() throws InterruptedException {
        WebElement loginBtnClick = driver.findElement(By.xpath("//div[@class='form-container']/child::form/child::div[@class='d-grid']/child::button"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click()",loginBtnClick);
        Thread.sleep(2000);

    }

}
