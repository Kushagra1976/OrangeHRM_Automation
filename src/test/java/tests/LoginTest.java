package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {

        LoginPage lp = new LoginPage(driver);
        lp.login("Admin", "admin123");

        try { Thread.sleep(2000); } catch (Exception e) {}

        DashboardPage dp = new DashboardPage(driver);
        Assert.assertTrue(dp.isDashboardDisplayed());

        System.out.println("Login Test Passed");
    }
}