import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;


public class Homepage {

//    public Homepage(WebDriver driver) {
//         PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
//    }

    @FindBy(xpath =  "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
    private WebElement menu;

//    AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,100);


    public void navigateWebsite(WebDriver driver) {
        driver.get(Constant.url);
    }

    public void selectMenu() {
        this.menu.click();
    }

}
