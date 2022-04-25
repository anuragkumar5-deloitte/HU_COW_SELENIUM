package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class adminLogin {

    WebDriver driver;
    public adminLogin(WebDriver driver){
        this.driver = driver;
    }
    public void clickLogin() {
        WebElement loginBtnClick = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
        loginBtnClick.click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
    }
    public void adminsigninBtn(){
        WebElement signBtn = driver.findElement(By.xpath("//a[@href='/ownerLogin']/child::button[text()='Sign in']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",signBtn);
        driver.findElement(By.xpath("//input[@id='formBasicUsername']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='formBasicPassword']")).sendKeys("admin");
        driver.findElement(By.xpath("//div[@class='d-grid']/child::button[text()='Login']")).click();
    }
}
