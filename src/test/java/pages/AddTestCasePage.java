package pages;

import elements.Button;
import elements.Dropdown;
import elements.Input;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddTestCasePage extends BasePage {
    public AddTestCasePage(WebDriver driver) {
        super(driver);
    }

    private String acceptAndNextButtonId = "accept_and_next";
    private String titleInputId = "title";
    private String preconditionsInputId = "custom_preconds_display";
    private String stepsInputId = "custom_steps_display";
    private String expectedResultInputId = "custom_expected_display";
    private By sectionDropdownLocator = By.xpath("//span[text() = 'Test Cases']");
    private By templateDropdownLocator = By.xpath("//span[text() = 'Test Case (Text)']");
    private String typeDropdownId = "type_id";
    private By priorityDropdownLocator = By.xpath("//div[@id = 'priority_id_chzn']");
    private By estimateInputLocator = By.cssSelector("input[name = estimate]");
    private String referencesInputId = "refs";
    private String automationTypeDropdownId = "custom_automation_type_chzn";
    private String addTestCaseButtonId = "accept";

    @Step
    public boolean isAcceptAndNextButtonDisplayed() {
        return driver.findElement(By.id(acceptAndNextButtonId)).isDisplayed();
    }

    @Step
    public void fillingOutTestCase() {
        new Input(driver, titleInputId).setValue("Позитивное тестирование формы Login");
        new Dropdown(driver, sectionDropdownLocator).selectOptionByText("Test Cases", false);
        new Dropdown(driver, templateDropdownLocator).selectOptionByText("Test Case (Text)", false);
        new Dropdown(driver, typeDropdownId).selectOptionByText("Other", false);
        new Dropdown(driver, priorityDropdownLocator).selectOptionByText("Critical", false);
        new Input(driver, estimateInputLocator).setValue("30");
        new Input(driver, referencesInputId).setValue("qwe");
        new Dropdown(driver, automationTypeDropdownId).selectOptionByText("None", false);
        new Input(driver, preconditionsInputId).setValue("Открыта форма Login на сайте TestRail");
        new Input(driver, stepsInputId).setValue("Заполнить поле email. Заполнить поле password. Нажать кнопку login");
        new Input(driver, expectedResultInputId).setValue("Пользователь авторизован");
        new Button(driver, addTestCaseButtonId).click();


    }

}
