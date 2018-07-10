import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration {


    @FindBy(xpath = "//*[@id=\"name_3_firstname\"]")
    private WebElement firstname;

    @FindBy(id = "name_3_lastname")
    private WebElement lastname;

    @FindBy(xpath = "//*[@id=\"pie_register\"]/li[2]/div/div/input[3]")
    private WebElement maritalStatus;

    @FindBy(name = "checkbox_5[]")
    private WebElement hobby;

    @FindBy(id = "dropdown_7")
    private WebElement country;

    public void register(String username, String lastname, String country) {
        firstname.sendKeys(username);
        this.lastname.sendKeys(lastname);
        this.country.sendKeys(country);
    }

    public void inputFirstname(String firstname) {
        this.firstname.click();
        this.firstname.sendKeys(firstname);
    }

    public void inputSurname(String surname) {
        this.lastname.click();
        this.lastname.sendKeys(surname);
    }
    public void inputCountry(String country){
        this.country.click();
        this.country.sendKeys(country);
    }


    public WebElement getFirstname() {
        return firstname;
    }

    public WebElement getLastname() {
        return lastname;
    }

    public WebElement getMaritalStatus() {
        return maritalStatus;
    }

    public WebElement getHobby() {
        return hobby;
    }

    public WebElement getCountry() {
        return country;
    }
}
