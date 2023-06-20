package pages;

import elements.Button;
import elements.Checkbox;
import elements.Input;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import models.Milestone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class AddMilestonePage extends BasePage {
    public AddMilestonePage(WebDriver driver) {
        super(driver);

    }

    private String nameInputId = "name";
    private String referencesInputId = "reference";
    private String descriptionInputId = "description_display";
    private By isCompletedCheckboxLocator = By.id("is_completed");
    private By addMilestoneButtonLocator = By.id("accept");

    @Step
    public void fillMilestone(Milestone milestone) {
        new Input(driver, nameInputId).setValue(milestone.getName());
        new Input(driver, referencesInputId).setValue(milestone.getReferences());
        new Input(driver, descriptionInputId).setValue(milestone.getDescription());
    }

    @Step
    public void checkCompletedMilestoneCheckbox() {
        new Checkbox(driver, isCompletedCheckboxLocator).check();

    }

    @Step
    public boolean isCompletedMilestoneCheckboxChecked() {
        return new Checkbox(driver, isCompletedCheckboxLocator).isChecked();
    }

    @Step
    public void clickAddMilestoneButton() {
        new Button(driver, addMilestoneButtonLocator).click();
    }


}
