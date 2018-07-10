import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.Before;
import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import sun.rmi.runtime.Log;

import static org.junit.Assert.*;


public class TheDemoSite {

    WebDriver driver;
    String url = "http://www.thedemosite.co.uk";
    ExtentReports report;
    ExtentTest test;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Development\\web_driver\\chromedriver.exe");
        driver = new ChromeDriver();
        report = new ExtentReports("C:\\Development\\web_driver\\Report.html", true);
        test = report.startTest("Verifying demo site function.");
    }


    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
        report.endTest(test);
        report.flush();
    }

    @Test
    @Ignore
    public void testDemoSite() throws InterruptedException {


        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]")).click();

        driver.findElement(By.name("username")).sendKeys("tony");
        driver.findElement(By.name("password")).sendKeys("rayman");
        driver.findElement(By.name("FormsButton2")).submit();
        driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")).click();
        driver.findElement(By.name("username")).sendKeys("tony");
        driver.findElement(By.name("password")).sendKeys("rayman");
        driver.findElement(By.name("FormsButton2")).submit();
        assertEquals("**Successful Login**", driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText() );

    }

    @Test
    public void pomDemoSite() {


        test.log(LogStatus.INFO, "Browser started.");

        driver.manage().window().maximize();
        driver.get(url);
        test.log(LogStatus.INFO, "Navigating to url.");
        Landing page = PageFactory.initElements(driver, Landing.class);
        AddUser adduser = PageFactory.initElements(driver, AddUser.class);
        LoginPage login = PageFactory.initElements(driver, LoginPage.class);

        page.clickAddUser();

        String title = driver.getTitle();

        if (title.equals("Add a user - FREE PHP code and SQL")) {
            test.log(LogStatus.PASS, "Navigation successful");
        } else {
            test.log(LogStatus.FAIL, "Failed navigation");
        }

        adduser.addUser();

        adduser.navigateLogin();
        test.log(LogStatus.INFO, "Login page.");

        login.login();
        if (login.getAnswer().equals("**Successful Login**")) {
            test.log(LogStatus.PASS, "Login Successful");
        } else {
            test.log(LogStatus.FAIL, "Login Failed.");
        }

        assertEquals("**Successful Login**", login.getAnswer());
    }
}
