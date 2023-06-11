package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Checkbox {
    private final MyElement element;

    public Checkbox(WebDriver driver, By by) {
        this.element = new MyElement(driver, by);
    }

    public Checkbox(WebElement element) {
        this.element = new MyElement(element);
    }

    public Checkbox(WebDriver driver, String id) {
        this.element = new MyElement(driver, By.id(id));
    }

    private List<MyElement> getAllCheckboxes() {
        return element.findMyElements(By.cssSelector("td[class='checkbox']"));
    }
    public void checkedUnchecked() {
        for (MyElement element : getAllCheckboxes()) {
                element.click();
                return;
            }
        }
    public void selectCheckboxByIndex(int index) {
        getAllCheckboxes().get(index).click();
    }
    }
