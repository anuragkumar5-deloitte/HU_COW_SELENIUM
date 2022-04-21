package TestCases;

import Resources.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class demo extends Base {
    public static void main(String[] args) throws InterruptedException {


        String webDriver = ("webdriver.chrome.driver");
        String exePath = ("src/main/java/Driver/chromedriver.exe");
        System.setProperty(webDriver, exePath);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://hu-spacecorp-urtjok3rza-wl.a.run.app/");
    }
}
