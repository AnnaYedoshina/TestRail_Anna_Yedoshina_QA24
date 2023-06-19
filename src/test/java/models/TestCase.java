package models;

import java.util.Objects;

public class TestCase {
    private String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestCase testCase = (TestCase) o;
        return Objects.equals(title, testCase.title) && Objects.equals(section, testCase.section) && Objects.equals(template, testCase.template) && Objects.equals(type, testCase.type) && Objects.equals(priority, testCase.priority) && Objects.equals(estimate, testCase.estimate) && Objects.equals(references, testCase.references) && Objects.equals(automationType, testCase.automationType) && Objects.equals(preconditions, testCase.preconditions) && Objects.equals(steps, testCase.steps) && Objects.equals(expectedResult, testCase.expectedResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, section, template, type, priority, estimate, references, automationType, preconditions, steps, expectedResult);
    }

    private String section;
    private String template;
    private String type;
    private String priority;
    private String estimate;
    private String references;
    private String automationType;
    private String preconditions;
    private String steps;
    private String expectedResult;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getEstimate() {
        return estimate;
    }

    public void setEstimate(String estimate) {
        this.estimate = estimate;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }

    public String getAutomationType() {
        return automationType;
    }

    public void setAutomationType(String automationType) {
        this.automationType = automationType;
    }

    public String getPreconditions() {
        return preconditions;
    }

    public void setPreconditions(String preconditions) {
        this.preconditions = preconditions;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }
}
