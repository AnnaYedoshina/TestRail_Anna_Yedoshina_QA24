package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddedTestCasePage extends BasePage {
    public AddedTestCasePage(WebDriver driver) {
        super(driver);
    }

    private By addAnotherLink = By.xpath("//a[text() = 'Add another']");

    @Step
    public boolean isAddAnotherLinkDisplayed() {
        return driver.findElement(addAnotherLink).isDisplayed();

    }


}
