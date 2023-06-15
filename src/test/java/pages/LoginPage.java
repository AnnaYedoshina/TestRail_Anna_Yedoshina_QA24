package pages;

import elements.Button;
import elements.Input;
import io.qameta.allure.Severity;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.reporters.EmailableReporter;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private String emailInputId = "name";
    private String passwordInputId = "password";
    private String loginButtonId = "button_primary";

    @Step
    public void logIn(String email, String password) {
        new Input(driver, emailInputId).setValue("yedoshina.java@gmail.com");
        new Input(driver, passwordInputId).setValue("Anna6178!");
        new Button(driver, loginButtonId).click();
    }


}
