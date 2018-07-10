import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "FormsButton2")
    private WebElement submit;

    @FindBy(xpath = "/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")
    private WebElement success;

    public void login() {
        username.sendKeys("tony");
        password.sendKeys("rayman");
        submit.click();
    }
    public String getAnswer() {

        return success.getText();
    }
}
