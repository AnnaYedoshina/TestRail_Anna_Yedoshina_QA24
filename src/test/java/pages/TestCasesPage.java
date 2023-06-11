package pages;

import elements.Button;
import elements.Checkbox;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCasesPage extends BasePage {
    public TestCasesPage(WebDriver driver) {
        super(driver);
    }

    public String addTestCaseButtonId = "sidebar-cases-add";
    public By checkBoxesLocator = By.cssSelector("td[class='checkbox']");

    @Step
    public boolean isTestCaseButtonDisplayed() {
        return driver.findElement(By.id(addTestCaseButtonId)).isDisplayed();
    }

    @Step
    public void clickTestCasesLink() {
        new Button(driver, addTestCaseButtonId).click();

    }
    @Step
    public void clickCheckbox(){
        new Checkbox(driver,checkBoxesLocator).selectCheckboxByIndex(1);

    }

}
