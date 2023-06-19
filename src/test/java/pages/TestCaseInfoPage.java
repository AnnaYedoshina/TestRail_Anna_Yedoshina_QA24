package pages;

import models.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCaseInfoPage extends BasePage {
    public TestCaseInfoPage(WebDriver driver) {
        super(driver);
    }

    public TestCase getTestCaseInfo() {
        TestCase testCase = new TestCase();
        testCase.setTitle(driver.findElement(By.cssSelector(".content-header-title.page_title")).getText());
        testCase.setSection(driver.findElement(By.xpath("//div[@class = 'content-breadcrumb']")).getText());
        testCase.setType(driver.findElement(By.id("cell_type_id")).getText().substring(4));
        testCase.setPriority(driver.findElement(By.id("cell_priority_id")).getText().substring(8));
        testCase.setEstimate(driver.findElement(By.id("cell_estimate")).getText().substring(8));
        testCase.setReferences(driver.findElement(By.id("cell_refs")).getText().substring(10));
        testCase.setAutomationType(driver.findElement(By.id("cell_custom_automation_type")).getText().substring(15));
        testCase.setPreconditions(driver.findElement
                (By.xpath("//span[@class =  'field-title-inner' and text() = 'Preconditions']/parent::div/following-sibling::div[@class='field-content'][1]//p")).getText());
        testCase.setSteps(driver.findElement
                (By.xpath("//span[@class='field-title-inner' and text() = 'Steps']/parent::div/following-sibling::div[@class='field-content'][1]//p")).getText());
        testCase.setExpectedResult(driver.findElement
                (By.xpath("//span[@class='field-title-inner' and text() = 'Expected Result']/parent::div/following-sibling::div[@class='field-content'][1]//p")).getText());
        return testCase;


    }
}
