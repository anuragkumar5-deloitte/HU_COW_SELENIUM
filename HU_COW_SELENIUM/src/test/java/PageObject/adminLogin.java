package PageObject;

import Resources.Base;
import org.openqa.selenium.By;
public class adminLogin extends Base {
    public void adminsigninBtn() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='formBasicUsername']")).sendKeys("admin");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='formBasicPassword']")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='d-grid']/child::button[text()='Login']")).click();
        Thread.sleep(2000);
    }
}
