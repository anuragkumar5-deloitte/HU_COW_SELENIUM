package Tests;
import Resources.*;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import PageObject.*;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;


public class addreviewtest extends baseclass
{

    @Test(priority = 1)
    public void loginscreen()throws InterruptedException
    {
        WebElement  loginscreen =  getelement("/html/body/div/div/div/nav/div/div/a/button");

       loginscreen.click();

        TimeUnit.MILLISECONDS.sleep(2000);
    }

    @Test(priority = 2)
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

    @Test(priority = 3)
    public void explorescreen()throws InterruptedException
    {
        WebElement explore = getelement("/html/body/div/div/div/nav/div/div/div[1]/a/li");
        explore.click();
        TimeUnit.MILLISECONDS.sleep(2000);

    }

    @Test(priority = 4)
    public void gurugramcorner()throws InterruptedException
    {
        WebElement gurugram = getelement("/html/body/div/div/div/div[1]/div[2]/div[1]/div[3]/div/div/div/div/div[2]/div[2]/a");
        js.executeScript("arguments[0].click()",gurugram);

        TimeUnit.MILLISECONDS.sleep(2000);


    }

    @Test(priority = 5)
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
