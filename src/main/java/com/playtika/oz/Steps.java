package com.playtika.oz;


import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Steps {
    private WebDriver driver;


    public void openBrowser() {
        this.driver = new ChromeDriver(); //this needs without greed, uncommitted in case of emergency
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    /*
    //Uncomment this in case you need remote execution
    public void intiRemote() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    */




    public void closeBrowser() {
        this.driver.quit();
    }

    public void loginOz(String name, String password) {
        LoginForm form = new LoginForm(driver);
        form.openPage();
        form.login(name, password);


    }

    public String isUserLoggedIn() {
        LoginForm form = new LoginForm(driver);
        return form.getUserName();
    }

    public void bookChoose(){
        BookPage page = new BookPage(driver);
        page.openPage();
        page.chooseBook();
    }

    public String isBookPurchased(){
        BookPage page = new BookPage(driver);
        return page.getPurchaseBookText();
    }

    public void searchItem(){
        HomePage page = new HomePage(driver);
        page.openPage();
        page.itemSearch();
    }

    public  String isItemFound(){
        HomePage page = new HomePage(driver);
        return page.getItemName();
    }

}
