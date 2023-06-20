package pages;

import elements.Button;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class AllProjectsPage extends BasePage {
    public AllProjectsPage(WebDriver driver) {
        super(driver);
    }

    public By testCasesLink = By.xpath("//*[@class = 'link' and contains(./text(), 'Test Cases')]");
    public By projectLinkLocator = By.xpath("//a[text() = 'AnnaYedoshinaQA24']");

    @Step
    public boolean isTestCasesLinkDisplayed() {
        return driver.findElement(testCasesLink).isDisplayed();
    }

    @Step
    public void clickTestCasesLink() {
        new Button(driver, testCasesLink).click();
    }

    @Step
    public void openProjectByName(String projectName) {
        log.info(String.format("Opening project by name = %s", projectName));
        new Button(driver, projectLinkLocator).click();

    }
}
