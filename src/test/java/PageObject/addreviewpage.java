package PageObject;

import Resources.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class addreviewpage extends Base
{
//    JavascriptExecutor js = (JavascriptExecutor) driver;

    public WebElement getelement(String xpath)
    {
        WebElement element = driver.findElement(By.xpath(xpath));
        return element;

    }

//    public void loginscreen()throws InterruptedException
//    {
//        //gets the element of the login screen button
//        WebElement  loginscreen =  getelement("/html/body/div/div/div/nav/div/div/a/button");
//
//        //clciks on the login screen button
//        loginscreen.click();
//
//        TimeUnit.MILLISECONDS.sleep(2000);
//
//        //gets the element of the username box
//        WebElement username = getelement("/html/body/div/div/div/div[1]/div[1]/form/div[1]/input");
//
//        //adds username
//        username.sendKeys("ayurai");
//
//        TimeUnit.MILLISECONDS.sleep(2000);
//
//        //gets the element of the password box
//        WebElement password = getelement("/html/body/div/div/div/div[1]/div[1]/form/div[2]/input");
//
//        //adds password
//        password.sendKeys("123456");
//
//        TimeUnit.MILLISECONDS.sleep(3000);
//
//        //gets the element of the terms and conditions
//        WebElement tickbox = getelement("/html/body/div/div/div/div[1]/div[1]/form/div[3]/div/input");
//        //clicks on the tickbox
//        tickbox.click();
//
//        TimeUnit.MILLISECONDS.sleep(3000);
//
//        //gets the element of the login button
//        WebElement loginbutton = getelement("//*[@id=\"root\"]/div/div/div[1]/div[1]/form/div[4]/button");
//
//        //clicks on the login button
//        js.executeScript("arguments[0].click()",loginbutton);
//
//        TimeUnit.MILLISECONDS.sleep(2000);
//    }


    //method tpo go to the explore screen, select gurugram and add a review
    public void addreview()throws InterruptedException

    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //gets the element of the explore button
        WebElement explore = getelement("/html/body/div/div/div/nav/div/div/div[1]/a/li");
        //clicks on explore button
        explore.click();

        TimeUnit.MILLISECONDS.sleep(2000);


        //gets the element of the gutugram place
        WebElement gurugram = getelement("/html/body/div/div/div/div[1]/div[2]/div[1]/div[3]/div/div/div/div/div[2]/div[2]/a");

        //clicks on gurugram place
        js.executeScript("arguments[0].click()",gurugram);

        TimeUnit.MILLISECONDS.sleep(1000);

        js.executeScript("window.scrollBy(0,500)");

        TimeUnit.MILLISECONDS.sleep(1000);

        js.executeScript("window.scrollBy(0,500)");

        TimeUnit.MILLISECONDS.sleep(1000);

        //gets the element of the add review button
        WebElement addreviewbutton = getelement("/html/body/div/div/div/div[1]/div[3]/button");

        //clicks on the add review button
        js.executeScript("arguments[0].click()",addreviewbutton);

        TimeUnit.MILLISECONDS.sleep(2000);

        //gets the element of the description box
        WebElement descriptionbox = getelement("/html/body/div/div/div/div[1]/div[3]/div[1]/form/div[2]/textarea");

        //adds a review in the description box
        descriptionbox.sendKeys("OK Place");

        TimeUnit.MILLISECONDS.sleep(2000);

        //gets the element of the submit button
        WebElement submitbutton = getelement("/html/body/div/div/div/div[1]/div[3]/div[1]/form/button[1]");

        //clicks on the submit button
        js.executeScript("arguments[0].click()",submitbutton);

        TimeUnit.MILLISECONDS.sleep(2000);

        driver.get("https://hu-spacecorp-urtjok3rza-wl.a.run.app/");
        TimeUnit.MILLISECONDS.sleep(2000);
        driver.navigate().refresh();

    }

}
