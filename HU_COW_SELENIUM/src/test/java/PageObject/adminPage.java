package PageObject;

import Resources.Base;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class adminPage extends Base {


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
        Thread.sleep(2000);


    }

    public void clickBookedSpace() throws InterruptedException {

        driver.findElement(By.xpath("//a[normalize-space()='Booked Spaces']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/nav/div/div/a/div/span")).click();
        Thread.sleep(2000);

    }

}

