import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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

    @FindBy(className = "piereg_pass")
    private WebElement passwordStrength;



    Actions action;

    public void registerSomeone(WebDriver driver) {
        action = new Actions(driver);
        FileInputStream file = null;

        try {
            file = new FileInputStream(Constant.filepath + Constant.file);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(file);
        } catch (IOException e) {
            System.out.println(e);
        }

        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFCell cell = sheet.getRow(1).getCell(0);

        inputFirstname(cell.getStringCellValue());

        //enter lastname
        cell = sheet.getRow(1).getCell(1);
        action.sendKeys(Keys.TAB, cell.getStringCellValue()).perform();

//        maritalStatus.click();
//        hobby.click();

        //selects country
        cell = sheet.getRow(1).getCell(2);
        inputCountry(cell.getStringCellValue());
        action.sendKeys(Keys.RETURN);

        cell = sheet.getRow(1).getCell(3);
        action.sendKeys(Keys.TAB, cell.getStringCellValue()).perform();
        action.sendKeys(Keys.RETURN);

        cell = sheet.getRow(1).getCell(4);
        action.sendKeys(Keys.TAB, cell.getStringCellValue()).perform();
        action.sendKeys(Keys.RETURN);

        cell = sheet.getRow(1).getCell(5);
        action.sendKeys(Keys.TAB, cell.getStringCellValue()).perform();
        action.sendKeys(Keys.RETURN);

        cell = sheet.getRow(1).getCell(6);
        action.sendKeys(Keys.TAB, cell.getStringCellValue()).perform();

        cell = sheet.getRow(1).getCell(7);
        action.sendKeys(Keys.TAB, cell.getStringCellValue()).perform();

        cell = sheet.getRow(1).getCell(8);
        action.sendKeys(Keys.TAB, cell.getStringCellValue()).perform();

//        action.sendKeys(Keys.TAB).perform();

    }

    public void inputFirstname(String firstname) {
        this.firstname.click();
        this.firstname.sendKeys(firstname);
        this.firstname.sendKeys(Keys.TAB);

    }

    public void inputSurname(String surname) {
        this.lastname.click();
        this.lastname.sendKeys(surname);
    }
    public void inputCountry(String country){
        this.country.click();
        this.country.sendKeys(country);
        this.country.sendKeys(Keys.RETURN);
    }


}
