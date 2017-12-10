package com.playtika.oz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginForm extends AbstractPage {


    public LoginForm(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "//span[@class='top-panel__userbar__auth__lbl']")
    private WebElement loginForm;

    @FindBy(id = "loginFormLoginEmailLink")
    private WebElement loginSwitcher;

    @FindBy(name = "cl_email")
    private WebElement nameField;

    @FindBy(name = "cl_psw")
    private WebElement passwordField;

    @FindBy(xpath = "//button[contains(@class, 'i-popup__form-button')]")
    private WebElement loginButton;

    @FindBy(xpath = "//span[@class='top-panel__userbar__user__name__inner']")
    private WebElement userNameText;

    public void openPage() {
        driver.get("https://www.oz.by/");
    }

    public void login(String name, String password) {

        loginForm.click();
        loginSwitcher.click();
        nameField.sendKeys(name);
        passwordField.sendKeys(password);

        loginButton.click();

    }

    public String getUserName() {
        return userNameText.getText();
    }


}
