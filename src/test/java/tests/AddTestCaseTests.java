package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddTestCaseTests extends BaseTest {
    @Test
    public void positiveAddTestCaseTest() {
        loginPage.logIn();
        allProjectsPage.clickTestCasesLink();
        testCasesPage.clickTestCasesLink();
        addTestCasePage.fillingOutTestCase();
        Assert.assertTrue(addedTestCasePage.isAddAnotherLinkDisplayed());


    }
}
