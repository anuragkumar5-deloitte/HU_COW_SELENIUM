package PageObject;

import Resources.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class addreviewpage extends Base
{
    JavascriptExecutor js;

    public void setJs()
    {
        js = (JavascriptExecutor) driver;
    }

    public WebElement getelement(String xpath)
    {
        WebElement element = driver.findElement(By.xpath(xpath));
        return element;

    }

    public void loginscreen()throws InterruptedException
    {
        WebElement  loginscreen =  getelement("/html/body/div/div/div/nav/div/div/a/button");

        loginscreen.click();

        TimeUnit.MILLISECONDS.sleep(2000);
    }

    public void login()throws InterruptedException
    {
        WebElement username = getelement("/html/body/div/div/div/div[1]/div[1]/form/div[1]/input");

        username.sendKeys("ayurai");

        TimeUnit.MILLISECONDS.sleep(2000);

        WebElement password = getelement("/html/body/div/div/div/div[1]/div[1]/form/div[2]/input");
        password.sendKeys("123456");

        TimeUnit.MILLISECONDS.sleep(3000);

        WebElement tickbox = getelement("/html/body/div/div/div/div[1]/div[1]/form/div[3]/div/input");
        tickbox.click();

        TimeUnit.MILLISECONDS.sleep(3000);


        WebElement loginbutton = getelement("//*[@id=\"root\"]/div/div/div[1]/div[1]/form/div[4]/button");
        js.executeScript("arguments[0].click()",loginbutton);

        TimeUnit.MILLISECONDS.sleep(2000);
    }


    public void explorescreen()throws InterruptedException
    {
        WebElement explore = getelement("/html/body/div/div/div/nav/div/div/div[1]/a/li");
        explore.click();
        TimeUnit.MILLISECONDS.sleep(2000);

    }


    public void gurugramcorner()throws InterruptedException
    {
        WebElement gurugram = getelement("/html/body/div/div/div/div[1]/div[2]/div[1]/div[3]/div/div/div/div/div[2]/div[2]/a");
        js.executeScript("arguments[0].click()",gurugram);

        TimeUnit.MILLISECONDS.sleep(2000);


    }


    public void addreview()throws InterruptedException
    {
        WebElement addreviewbutton = getelement("/html/body/div/div/div/div[1]/div[3]/button");
        js.executeScript("arguments[0].click()",addreviewbutton);

        TimeUnit.MILLISECONDS.sleep(2000);

        WebElement descriptionbox = getelement("/html/body/div/div/div/div[1]/div[3]/div[1]/form/div[2]/textarea");
        descriptionbox.sendKeys("Bad place");

        TimeUnit.MILLISECONDS.sleep(2000);

        WebElement submitbutton = getelement("/html/body/div/div/div/div[1]/div[3]/div[1]/form/button[1]");
        js.executeScript("arguments[0].click()",submitbutton);

        TimeUnit.MILLISECONDS.sleep(2000);
    }

}
