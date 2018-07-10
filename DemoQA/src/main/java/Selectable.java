import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Selectable {

    @FindBy(xpath = "//*[@id=\"selectable\"]/li[1]")
    private WebElement item1;

    @FindBy(xpath = "//*[@id=\"selectable\"]/li[2]")
    private WebElement item2;

    @FindBy(xpath = "//*[@id=\"selectable\"]/li[3]")
    private WebElement item3;

    @FindBy(xpath = "//*[@id=\"selectable\"]/li[4]")
    private WebElement item4;

    public void selectItem1(WebDriver driver) {
        new Actions(driver).click(item1).perform();
    }

    public void selectItem2(WebDriver driver){
       new Actions(driver).click(item2).perform();
    }

    public void selectItem3(WebDriver driver) {
        new Actions(driver).click(item3).perform();
    }

    public void selectItem4(WebDriver driver) {
        new Actions(driver).click(item4).perform();
    }

    public void selectMulti(WebDriver driver, WebElement start, WebElement end) {
        new Actions(driver).clickAndHold(start).moveToElement(end).perform();
    }


    public WebElement getItem1() {
        return item1;
    }

    public WebElement getItem2() {
        return item2;
    }

    public WebElement getItem3() {
        return item3;
    }

    public WebElement getItem4() {
        return item4;
    }
}
