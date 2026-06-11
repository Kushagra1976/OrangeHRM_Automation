package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage {

    WebDriver driver;

    public PIMPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='PIM']")
    WebElement pimMenu;

    @FindBy(xpath = "//a[text()='Add Employee']")
    WebElement addEmployee;

    @FindBy(name = "firstName")
    WebElement firstName;

    @FindBy(name = "lastName")
    WebElement lastName;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveBtn;

    public void addEmployee(String fName, String lName) {

        pimMenu.click();
        sleep();

        addEmployee.click();
        sleep();

        firstName.sendKeys(fName);
        sleep();

        lastName.sendKeys(lName);
        sleep();

        saveBtn.click();
        sleep();
    }

    public void sleep() {
        try { Thread.sleep(1500); } catch (Exception e) {}
    }
}