import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.sun.org.apache.bcel.internal.generic.TABLESWITCH;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import javafx.scene.control.Tab;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.*;

public class DemoQa {

    WebDriver driver;
    String url = Constant.url;
    ExtentReports report;
    ExtentTest test;
    Actions action;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", Constant.filepath + Constant.chromeDriver);
        driver = new ChromeDriver();

        action = new Actions(driver);
        report = new ExtentReports(Constant.filepath+Constant.reportFile, true);
        test = report.startTest("Testing");

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2500);
        driver.quit();
        report.endTest(test);
        report.flush();
    }

    @Test
    @Ignore
    public void droppable() {
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(By.xpath("//*[@id=\"menu-item-141\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"droppableview\"]")).click();
        WebElement source = driver.findElement(By.xpath("//*[@id=\"draggableview\"]"));
        WebElement target = driver.findElement(By.xpath("//*[@id=\"droppableview\"]"));
        (new Actions(driver)).dragAndDrop(source, target).perform();
        assertEquals( "Dropped!", driver.findElement(By.xpath("//*[@id=\"droppableview\"]/p")).getText());

    }

    @Test
    public void pomDroppable() {
        Homepage home = PageFactory.initElements(driver,Homepage.class);
        Droppable main = PageFactory.initElements(driver, Droppable.class);
        driver.manage().window().maximize();
        driver.get(url);
        home.navDrop();
        main.dragAndDrop(driver, main.getSource(), main.getTarget());
        assertEquals("Dropped!", main.getText().getText() );

    }

    @Test
    @Ignore
    public void selectable() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(By.xpath("//*[@id=\"menu-item-142\"]/a")).click();
        WebElement item =  driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
        item.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]")).click();
        Thread.sleep(2000);
        WebElement last = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
        last.click();
        Thread.sleep(2000);

        (new Actions(driver)).clickAndHold(item).perform();
        (new Actions(driver)).moveToElement(last).perform();

    }
    @Test
    public void pomSelectable() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(url);

        Homepage home = PageFactory.initElements(driver, Homepage.class);
        Selectable select = PageFactory.initElements(driver, Selectable.class);
        home.navSelect();
        select.selectItem1(driver);
        select.selectItem2(driver);
        select.selectItem3(driver);
        select.selectItem4(driver);
        select.selectMulti(driver, select.getItem1(), select.getItem4() );

//        WebElement myDynamicElement = (new WebDriverWait(driver, 10))
//                .until(ExpectedConditions.presenceOfElementLocated(By.id();")));
//        assertEquals();
    }

    @Test
    @Ignore
    public void registration() {
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(By.xpath("//*[@id=\"menu-item-374\"]/a")).click();
        driver.findElement(By.name("first_name")).sendKeys("Tony");
        driver.findElement(By.name("last_name")).sendKeys("Smith");
        driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[2]/div/div/input[1]")).click();
        driver.findElement(By.id("dropdown_7")).sendKeys("United Kingdom");
        driver.findElement(By.id("mm_date_8")).sendKeys("9");
        driver.findElement(By.id("dd_date_8")).sendKeys("4");
        driver.findElement(By.id("yy_date_8")).sendKeys("1996");
//        new Actions(driver).click(driver.findElement(By.id("dropdown_7"))).perform();
    }

    @Test
    public void pomRegistration() {
        Homepage home = PageFactory.initElements(driver, Homepage.class);
        Registration reg = PageFactory.initElements(driver, Registration.class);

        driver.manage().window().maximize();
        driver.get(url);
        home.navReg();

        reg.registerSomeone(driver);

    }
}
