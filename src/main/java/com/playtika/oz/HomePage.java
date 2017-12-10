package com.playtika.oz;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {


    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void openPage() {
        driver.get("https://www.oz.by/");
    }

    @FindBy(id = "top-s")
    private WebElement searchLine;

    @FindBy(className = "top-panel__search__btn")
    private WebElement serachButton;

    @FindBy(xpath = "//a[contains(@href, 'more1054381')]")
    private WebElement itemSearch;

    @FindBy(xpath = "//h1[@itemprop='name']")
    private WebElement itemText;

    public void itemSearch(){
        searchLine.sendKeys("java");
        serachButton.click();
        itemSearch.click();
    }
    public String getItemName(){
        return itemText.getText();
    }
}
