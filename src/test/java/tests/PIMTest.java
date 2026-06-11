package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LandingPage;
import pages.LoginPage;
import pages.PIMPage;

public class PIMTest extends BaseTest {

    @Test
    public void fullFlowTest() {

        // Login
        LoginPage lp = new LoginPage(driver);
        lp.login("Admin", "admin123");

        // Landing Page
        LandingPage home = new LandingPage(driver);
        Assert.assertTrue(home.isDashboardVisible());

        // Add Employee
        PIMPage pim = new PIMPage(driver);
        pim.addEmployee("John", "Doe");

        // Logout
        home.logout();
    }
}