package PageObject;

import Resources.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class adminPage extends Base {
    WebDriver driver;
    public adminPage(WebDriver driver){
        this.driver=driver;
    }



    public void visitAdminPage() throws InterruptedException {

        WebElement loginBtnClick = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
        loginBtnClick.click();
        Thread.sleep(2000);
        WebElement signBtn = driver.findElement(By.xpath("//a[@href='/ownerLogin']/child::button[text()='Sign in']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",signBtn);
        driver.findElement(By.xpath("//input[@id='formBasicUsername']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='formBasicPassword']")).sendKeys("admin");
        driver.findElement(By.xpath("//div[@class='d-grid']/child::button[text()='Login']")).click();

    }



    public void fillAddSpaceForm() throws InterruptedException {
        driver.findElement(By.xpath("//a[normalize-space()='Add Space']")).click();
        driver.findElement(By.xpath("//input[@id='exampleInputSpaceName']")).sendKeys("Sample Place Three");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='exampleInputSpaceAddress']")).sendKeys("Sample Address Three");


        driver.findElement(By.xpath("//input[@id='exampleSpacePrice']")).sendKeys("100");
        Thread.sleep(2000);
        WebElement addBtnClick = driver.findElement(By.xpath("//button[@type='submit']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",addBtnClick);






    }





}

