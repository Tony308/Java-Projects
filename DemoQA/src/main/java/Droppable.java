import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Droppable {

    @FindBy(xpath = "//*[@id=\"draggableview\"]")
    private WebElement source;

    @FindBy(xpath = "//*[@id=\"droppableview\"]")
    private WebElement target;

    @FindBy(xpath = "//*[@id=\"droppableview\"]/p")
    private WebElement text;


    public void dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
        source.click();
        new Actions(driver).dragAndDrop(source,target).perform();
    }

    public WebElement getTarget() {
        return target;
    }

    public WebElement getSource() {
        return source;
    }

    public WebElement getText() {
        return text;
    }
}
