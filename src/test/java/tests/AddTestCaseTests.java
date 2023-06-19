package tests;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonTypeInfo;
import models.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProjectPage;

public class AddTestCaseTests extends BaseTest {
    @Test
    public void positiveAddTestCaseTest() {
        TestCase actualTestCase = new TestCase();
        actualTestCase.setTitle("Позитивное тестирование формы Login");
        actualTestCase.setSection("Test Cases");
        actualTestCase.setTemplate("Test Case (Text)");
        actualTestCase.setType("Other");
        actualTestCase.setPriority("Critical");
        actualTestCase.setEstimate("30 minutes");
        actualTestCase.setReferences("qwe");
        actualTestCase.setAutomationType("None");
        actualTestCase.setPreconditions("Открыта форма Login на сайте TestRail");
        actualTestCase.setSteps("Заполнить поле email. Заполнить поле password. Нажать кнопку login");
        actualTestCase.setExpectedResult("Пользователь авторизован");
        String projectName = "AnnaYedoshinaQA24";
        loginPage.logIn(EMAIL, PASSWORD);
        allProjectsPage.openProjectByName(projectName);
        projectPage.clickAddTestCasesLink();
        addTestCasePage.fillingOutTestCase(actualTestCase);
        addTestCasePage.clickAddTestCaseButton();
        Assert.assertTrue(addedTestCasePage.isAddAnotherLinkDisplayed());
        TestCase expectedTestCase = testCaseInfoPage.getTestCaseInfo();
        Assert.assertEquals(expectedTestCase,actualTestCase);


    }
}
