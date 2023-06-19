package pages;

import elements.Checkbox;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCasesPage extends BasePage {
    public TestCasesPage(WebDriver driver) {
        super(driver);
    }

    public By checkBoxesLocator = By.cssSelector(".selectionCheckbox");

    @Step
    public void checkCheckboxChooseAll() {
        new Checkbox(driver, checkBoxesLocator).check();

    }

    @Step
    public void uncheckCheckbox() {
        new Checkbox(driver, checkBoxesLocator).uncheck();
    }

    @Step
    public boolean isCheckboxChecked() {
        return new Checkbox(driver, checkBoxesLocator).isChecked();

    }
}

