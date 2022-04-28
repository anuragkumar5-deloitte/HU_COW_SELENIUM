package PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        driver.findElement(By.xpath("//input[@id='exampleInputSpaceName']")).sendKeys("HashedIN ");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='exampleInputSpaceAddress']")).sendKeys("Gurugram");


        driver.findElement(By.xpath("//input[@id='exampleSpacePrice']")).sendKeys("200");
        Thread.sleep(2000);
        WebElement addBtnClick = driver.findElement(By.xpath("//button[@type='submit']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",addBtnClick);
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        //System.out.println(alert.getText());
        alert.accept();


    }

    public void clickAddSpace() throws InterruptedException {
        driver.findElement(By.xpath("//a[normalize-space()='Add Space']")).click();
        Thread.sleep(2000);
//        WebDriverWait wait = new WebDriverWait(driver, 2);
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alert = driver.switchTo().alert();
//        //System.out.println(alert.getText());
//        alert.accept();
        //driver.switchTo().alert().accept();


    }

    public void clickTotalSpace() throws InterruptedException {

        driver.findElement(By.xpath("//div[@class='totalSpacesCard card']//div[@class='card-body']")).click();
        Thread.sleep(2000);

    }
    public void clickBookedSpace() throws InterruptedException {

        driver.findElement(By.xpath("//a[normalize-space()='Booked Spaces']")).click();
        Thread.sleep(2000);

    }

}

