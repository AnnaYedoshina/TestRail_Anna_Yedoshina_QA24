package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test
    public void positiveLoginTest() {
        loginPage.logIn(EMAIL, PASSWORD);
        Assert.assertTrue(allProjectsPage.isTestCasesLinkDisplayed());
    }

}
