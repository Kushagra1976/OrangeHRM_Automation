package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h6[text()='Dashboard']")
    WebElement dashboardText;

    @FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
    WebElement profileIcon;

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logoutBtn;

    public boolean isDashboardVisible() {
        sleep();
        return dashboardText.isDisplayed();
    }

    public void logout() {

        profileIcon.click();
        sleep();

        logoutBtn.click();
        sleep();
    }

    public void sleep() {
        try { Thread.sleep(1500); } catch (Exception e) {}
    }
}