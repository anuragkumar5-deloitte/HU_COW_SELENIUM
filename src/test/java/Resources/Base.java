package Resources;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
        public WebDriver driver;
        public Properties prop;
        public String browserName;
        public String url;
        static ExtentReports extent;


        public WebDriver browserIntilization() throws IOException {

            prop = new Properties();
            FileInputStream fis = new FileInputStream("");
            prop.load(fis);
            browserName = prop.getProperty("browser");
            url = prop.getProperty("url");

            String webDriver = ("webdriver.chrome.driver");
            String exePath = ("src/main/java/Driver/chromedriver.exe");
            System.setProperty(webDriver,exePath);
            driver = new ChromeDriver();


            driver.manage().window().maximize();
            driver.get(url);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            return driver;

        }





        public String screenShot(String testcaseName, WebDriver driver) throws IOException
        {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            String destinationFile = "";
            FileUtils.copyFile(source, new File(destinationFile));
            return destinationFile;
        }



        public static ExtentReports ReportObject()
        {
            String path = "";

            ExtentSparkReporter reporter = new ExtentSparkReporter(path);
            reporter.config().setReportName("Web Automation results");
            reporter.config().setDocumentTitle("Test Results");


            extent=new ExtentReports();
            extent.attachReporter(reporter);
            extent.setSystemInfo("Tester", "Anurag");
            return extent;

        }

    }

