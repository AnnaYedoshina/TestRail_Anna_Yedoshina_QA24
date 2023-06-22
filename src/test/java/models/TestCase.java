package models;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.openqa.selenium.support.ui.Select;


@Builder(setterPrefix = "set")
@EqualsAndHashCode
@ToString
@Getter
public class TestCase {
    private String title;
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

}
