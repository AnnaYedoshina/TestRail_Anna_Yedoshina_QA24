package pages;

import elements.Button;
import elements.Input;
import io.qameta.allure.Severity;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.reporters.EmailableReporter;

@Log4j2
public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private String emailInputId = "name";
    private String passwordInputId = "password";
    private String loginButtonId = "button_primary";

    @Step
    public void logIn(String email, String password) {
        log.info(String.format("logging in with email= %s and password = %s", email, password));
        new Input(driver, emailInputId).setValue(email);
        new Input(driver, passwordInputId).setValue(password);
        new Button(driver, loginButtonId).click();
    }


}
