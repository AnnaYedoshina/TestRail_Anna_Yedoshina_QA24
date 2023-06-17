package pages;

import elements.Button;
import elements.Checkbox;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectPage extends BasePage {
    public ProjectPage(WebDriver driver) {
        super(driver);
    }

    public String addTestCaseButtonId = "sidebar-cases-add";
    public String testCasesButtonId = "sidebar-cases-overview";

    public String addTestRunsButtonId = "sidebar-runs-add";


    @Step
    public boolean isTestCaseButtonDisplayed() {
        return driver.findElement(By.id(addTestCaseButtonId)).isDisplayed();
    }

    @Step
    public void clickAddTestCasesLink() {
        new Button(driver, addTestCaseButtonId).click();

    }

    @Step
    public void clickTestCasesButton() {
        new Button(driver, testCasesButtonId).click();
    }

    @Step
    public void clickAddTestRunsButton(){
        new Button(driver, addTestRunsButtonId).click();
    }


}
