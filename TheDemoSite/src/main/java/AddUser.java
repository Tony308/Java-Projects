import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUser {

    @FindBy(name = "username")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "FormsButton2")
    private WebElement submit;

    @FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")
    private WebElement link;

    public void addUser() {

        username.sendKeys("tony");
        password.sendKeys("rayman");
        submit.click();
    }

    public void navigateLogin() {
        link.click();
    }
}
