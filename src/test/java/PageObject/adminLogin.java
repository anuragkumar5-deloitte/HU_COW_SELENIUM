package PageObject;

import org.openqa.selenium.By;

public class adminLogin extends Base {

//    WebDriver driver;
//    public adminLogin(WebDriver driver){
//        this.driver = driver;
//    }
//    public void clickLogin() {
//        WebElement loginBtnClick = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
//        loginBtnClick.click();
//        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
//    }
    public void adminsigninBtn() throws InterruptedException {
//        WebElement signBtn = driver.findElement(By.xpath("//a[@href='/ownerLogin']/child::button[text()='Sign in']"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click()",signBtn);
        driver.findElement(By.xpath("//input[@id='formBasicUsername']")).sendKeys("admin");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='formBasicPassword']")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='d-grid']/child::button[text()='Login']")).click();
        Thread.sleep(2000);
    }
}
