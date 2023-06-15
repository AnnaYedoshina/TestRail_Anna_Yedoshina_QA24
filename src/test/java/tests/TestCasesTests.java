package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCasesTests extends BaseTest{
    @Test
    public void checkBoxesTest(){
        loginPage.logIn(EMAIL,PASSWORD);
        allProjectsPage.clickTestCasesLink();
        testCasesPage.clickCheckbox();

    }
}
