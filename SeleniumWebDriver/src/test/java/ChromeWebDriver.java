import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class ChromeWebDriver {

    WebDriver driver;
    String url = "http://www.bbc.com";

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Development\\web_driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void testSomething() {
        driver.manage().window().maximize();
        driver.get("http://www.youtube.com/");
        driver.findElement(By.name("search_query") ).sendKeys("Macie Jay");
        driver.findElement(By.id("search-form")).submit();
        driver.findElement(By.xpath("//*[@id=\"img\"]")).click();

    }


}
