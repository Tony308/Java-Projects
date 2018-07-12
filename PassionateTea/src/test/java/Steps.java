import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.da.Men;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.PageFactory;


import static org.junit.Assert.*;

public class Steps {

    WebDriver driver;
    ExtentReports report;
    ExtentTest test;


    @Before
    public void setup() {

        System.setProperty("webdriver.chrome.driver", Constant.filepath + Constant.chromeDriver);
        driver = new ChromeDriver();
        report = new ExtentReports(Constant.filepath+Constant.report, false);

        test = report.startTest("Testing PassionateTea.");
        test.log(LogStatus.INFO, "Test has started.");

        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
        report.endTest(test);
        report.flush();
    }

    @Given("^the correct web address$")
    public void the_correct_web_address() {
        Homepage home = PageFactory.initElements(driver, Homepage.class);
        home.navigateWebsite(driver);
        String title = driver.getTitle();
        if (title.equals("Welcome")) {
            test.log(LogStatus.PASS, "Website accessed");
        } else {
            test.log(LogStatus.FAIL, "Website access failed.");
        }
    }

    @When("^I navigate to the 'Menu' page$")
    public void i_navigate_to_the_Menu_page(){
//        driver.findElement(By.xpath("//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]")).click();
        Homepage home = PageFactory.initElements(driver, Homepage.class);
        home.selectMenu();
    }

    @Then("^I can browse a list of the available products\\.$")
    public void i_can_browse_a_list_of_the_available_products() {
        assertEquals("Menu", driver.getTitle());
        test.log(LogStatus.PASS, "Browse list available.");
    }

    @When("^I click the checkout button$")
    public void i_click_the_checkout_button() {

        Menu menu = PageFactory.initElements(driver, Menu.class);
        menu.clickCheckOut();
    }

    @Then("^I am taken to the checkout page$")
    public void i_am_taken_to_the_checkout_page() {
        assertEquals("Check Out", driver.getTitle());
        test.log(LogStatus.PASS, "Checkout successful.");
    }

}
