package com.quinbay.qa.training.Actions;

import com.quinbay.qa.training.pages.HomePage;
import com.quinbay.qa.training.test.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Actions {
    public Page homePage;


    public Actions(WebDriver driver) {
        homePage = PageFactory.initElements(driver, Page.class);
    }
    public void searchForAnItem(String item){
        homePage.searchForAnItem(item);

    }

    public void AddToCart(){
        homePage.selectItem();
        homePage.addToCart();
        homePage.ViewCart();
    }

    public void CheckOut(){
        homePage.CheckOut();
    }

    public void Add_Details(){
        homePage.BillingDetails();
    }

    public void Payment(WebDriver driver){
        WebElement cod = driver.findElement(By.id("payment_method_cod"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked=true;", cod);
    }

    public void PlaceOrder(){ homePage.PlaceOrder();}


}
