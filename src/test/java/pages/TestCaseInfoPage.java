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
        testCase.setType(driver.findElement(By.xpath("//label[text() = 'Type']//following-sibling::text()")).getText());
        testCase.setPriority(driver.findElement(By.xpath("//label[text() = 'Priority']//following-sibling::text()")).getText());
        testCase.setEstimate(driver.findElement(By.xpath("//label[text() = 'Estimate']//following-sibling::text()")).getText());
        testCase.setReferences(driver.findElement(By.xpath("//label[text() = 'References']//following-sibling::text()")).getText());
        testCase.setAutomationType(driver.findElement(By.xpath("//label[text() = 'Automation Type']//following-sibling::text()")).getText());
        testCase.setPreconditions(driver.findElement
                (By.xpath("//span[@class =  'field-title-inner' and text() = 'Preconditions']/parent::div/following-sibling::div[@class='field-content']//following-sibling::div[@class = 'markdown']//following-sibling::p")).getText());
        testCase.setSteps(driver.findElement
                (By.xpath("//span[@class =  'field-title-inner' and text() = 'Steps']/parent::div/following-sibling::div[@class='field-content']//following-sibling::div[@class = 'markdown']//following-sibling::p")).getText());
        testCase.setExpectedResult(driver.findElement
                (By.xpath("//span[@class =  'field-title-inner' and text() = 'Expected Result']/parent::div/following-sibling::div[@class='field-content']//following-sibling::div[@class = 'markdown']//following-sibling::p")).getText());
        return testCase;


    }
}
