import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Wait;
import static org.junit.Assert.*;


public class TheDemoSite {

    WebDriver driver;
    String url = "http://www.thedemosite.co.uk";

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Development\\web_driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void testDemoSite() {
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
}
