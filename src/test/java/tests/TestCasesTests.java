package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCasesTests extends BaseTest {

    @Test
    public void checkCheckBoxTest() {
        String projectName = "AnnaYedoshinaQA24";
        loginPage.logIn(EMAIL, PASSWORD);
        allProjectsPage.openProjectByName(projectName);
        projectPage.clickTestCasesButton();
        testCasesPage.checkCheckbox();
        Assert.assertTrue(testCasesPage.isCheckboxChecked());

    }

    @Test
    public void uncheckCheckboxTest() {
        String projectName = "AnnaYedoshinaQA24";
        loginPage.logIn(EMAIL, PASSWORD);
        allProjectsPage.openProjectByName(projectName);
        projectPage.clickTestCasesButton();
        testCasesPage.checkCheckbox();
        testCasesPage.uncheckCheckbox();
        Assert.assertFalse(testCasesPage.isCheckboxChecked());

    }
}
