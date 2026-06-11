package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginBtn;

    public void login(String user, String pass) {

        username.sendKeys(user);
        sleep();

        password.sendKeys(pass);
        sleep();

        loginBtn.click();
        sleep();
    }

    public void sleep() {
        try { Thread.sleep(1500); } catch (Exception e) {}
    }
}