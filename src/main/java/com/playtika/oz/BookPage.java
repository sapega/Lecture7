package com.playtika.oz;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookPage extends AbstractPage{

    public BookPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get("https://www.oz.by/");
    }

    @FindBy(xpath = "//li[@class='main-nav__list__li main-nav__list__li_wnav']/a[@class='main-nav__list__item ']")
    private WebElement naviPanel;

    @FindBy(className = "offers-slider__item__btn")
    private WebElement offerButton;

    @FindBy(xpath = "//a[@href='/books/more102199.html']")
    private WebElement topBookChoose;

    @FindBy(xpath = "//button[@class='b-product-control__button i-button i-button_large i-button_orange addtocart-btn first-button']")
    private WebElement basketButton;

    @FindBy(xpath = "//a[@href='/checkout/']")
    private WebElement checkoutButton;

    @FindBy(xpath = "//div[@class='goods-table-cell__link']/a[@href='https://oz.by/books/more102199.html']")
    private WebElement pruchaseBookText;

    public void chooseBook(){
        naviPanel.click();
        offerButton.click();
        topBookChoose.click();
        basketButton.click();
        checkoutButton.click();
    }

    public String getPurchaseBookText(){
        return pruchaseBookText.getText();
    }
}
