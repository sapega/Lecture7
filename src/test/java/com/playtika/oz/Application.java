package com.playtika.oz;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Please uncomment Steps/initRemote when using remote and run .bat fle to run remote hub

public class Application {

    private static final String LOGIN = "val.pupok@bk.ru";
    private static final String PASSWORD = "y5Rcz8";
    private Steps steps;

    @BeforeMethod
    public void setUp() {
        steps = new Steps();
        //steps.intiRemote(); Uncomment in case of using remote
        steps.openBrowser();

    }

    @Test(priority = 1)
    public void useLogin() {
        steps.loginOz(LOGIN, PASSWORD);
        Assert.assertEquals(steps.isUserLoggedIn(), "Вал Пупок");

    }

    @Test(priority = 2)
    public void bookChoose() {
        steps.bookChoose();
        Assert.assertEquals(steps.isBookPurchased(), "Оно");
    }

    @Test(priority = 3)
    public void searchItem() {
        steps.searchItem();
        Assert.assertEquals(steps.isItemFound(), "Java 8. Руководство для начинающих");
    }

    @AfterMethod
    public void tearDown() {
        steps.closeBrowser();

    }


}
