package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    By profileIcon = By.xpath("//span[@class='oxd-userdropdown-tab']");
    By logoutBtn = By.xpath("//a[text()='Logout']");
    By dashboardText = By.xpath("//h6[text()='Dashboard']");

    public boolean isDashboardDisplayed() {
        return driver.findElement(dashboardText).isDisplayed();
    }

    public void logout() {

        driver.findElement(profileIcon).click();
        sleep();

        driver.findElement(logoutBtn).click();
        sleep();
    }

    public void sleep() {
        try {
            Thread.sleep(1500);
        } catch (Exception e) {}
    }
}