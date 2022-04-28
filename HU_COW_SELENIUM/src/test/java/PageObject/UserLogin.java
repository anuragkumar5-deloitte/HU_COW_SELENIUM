package PageObject;


import Resources.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
public class UserLogin extends Base {
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
