package pages;

import elements.Radiobutton;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class AddTestRunPage extends BasePage {
    public AddTestRunPage(WebDriver driver) {
        super(driver);
    }
    public String includeAllRadioId = "includeAll";
    public String selectSpecificRadioId = "includeSpecific";

    public String dynamicRadioId = "includeDynamic";

    @Step
    public void checkSelectSpecificRadio(){
        new Radiobutton(driver, selectSpecificRadioId).check();
    }
    @Step
    public boolean isSelectSpecificRadioChecked(){
        return new Radiobutton(driver,selectSpecificRadioId).isChecked();
    }

    @Step
    public boolean isIncludeAllRadioUnchecked(){
        return new Radiobutton(driver, includeAllRadioId).isChecked();
    }

}
