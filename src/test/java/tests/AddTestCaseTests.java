package tests;

import models.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProjectPage;

public class AddTestCaseTests extends BaseTest {
    @Test
    public void positiveAddTestCaseTest() {
        TestCase testCase = new TestCase();
        testCase.setTitle("Позитивное тестирование формы Login");
        testCase.setSection("Test Cases");
        testCase.setTemplate("Test Case (Text)");
        testCase.setType("Other");
        testCase.setPriority("Critical");
        testCase.setEstimate("30");
        testCase.setReferences("qwe");
        testCase.setAutomationType("None");
        testCase.setPreconditions("Открыта форма Login на сайте TestRail");
        testCase.setSteps("Заполнить поле email. Заполнить поле password. Нажать кнопку login");
        testCase.setExpectedResult("Пользователь авторизован");
        String projectName = "AnnaYedoshinaQA24";
        loginPage.logIn(EMAIL, PASSWORD);
        allProjectsPage.openProjectByName(projectName);
        projectPage.clickAddTestCasesLink();
        addTestCasePage.fillingOutTestCase(testCase);
        addTestCasePage.clickAddTestCaseButton();
        Assert.assertTrue(addedTestCasePage.isAddAnotherLinkDisplayed());


    }
}
