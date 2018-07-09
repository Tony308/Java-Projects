import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.*;

public class DemoQa {

    WebDriver driver;
    String url = "http://demoqa.com/";

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Development\\web_driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2500);
        driver.quit();
    }

    @Test
    public void droppable() {
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(By.xpath("//*[@id=\"menu-item-141\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"draggableview\"]"));
        driver.findElement(By.xpath("//*[@id=\"droppableview\"]")).click();
        WebElement source = driver.findElement(By.xpath("//*[@id=\"draggableview\"]"));
        WebElement target = driver.findElement(By.xpath("//*[@id=\"droppableview\"]"));

        (new Actions(driver)).dragAndDrop(source, target).perform();

        assertEquals( "Dropped!", driver.findElement(By.xpath("//*[@id=\"droppableview\"]/p")).getText());


    }

    @Test
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
}
