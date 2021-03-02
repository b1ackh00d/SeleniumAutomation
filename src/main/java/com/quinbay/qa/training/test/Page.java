package com.quinbay.qa.training.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class Page {
//    WebDriver driver;

    public Page(WebDriver webDriver){
//        driver=webDriver;
    }

    @FindBy(xpath = "//input[contains(@id, 'woocommerce-product-search-field-0')]")
    WebElement searchBox;

    @FindBy(xpath = "//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/vneck-tee.jpg']")
    WebElement img;

    @FindBy(xpath = "//button[@name='add-to-cart']") WebElement addCart;

    @FindBy(xpath = "//a[@href='https://www.edgewordstraining.co.uk/demo-site/cart/']") WebElement ViewCart;

    @FindBy(xpath = "//a[@href='https://www.edgewordstraining.co.uk/demo-site/checkout/']") WebElement checkOut;

    @FindBy(id = "billing_first_name") WebElement firstName;

    @FindBy(id = "billing_last_name") WebElement lastName;

    @FindBy(xpath = "//input[@id='billing_address_1']") WebElement billing_addr;

    @FindBy(xpath = "//input[@id='billing_address_2']") WebElement billing_addr_1;

    @FindBy(id = "billing_city") WebElement city;

    @FindBy(id = "billing_state") WebElement billing_state;

    @FindBy(id = "billing_postcode") WebElement postCode;

    @FindBy(id = "billing_phone") WebElement phone;

    @FindBy(id = "billing_email") WebElement email;

    @FindBy(id = "payment_method_cod") WebElement cod;

    @FindBy(id = "place_order") WebElement order;




    public void searchForAnItem(String item){
        searchBox.sendKeys(item);
        searchBox.submit();
    }

    public void selectItem(){ img.click(); }

    public void addToCart() { addCart.click(); }

    public void ViewCart() { ViewCart.click(); }

    public void CheckOut() { checkOut.click(); }

    public void BillingDetails() {

        firstName.sendKeys("Hari");

        lastName.sendKeys("M");

        billing_addr.sendKeys("QuinBay");

        billing_addr_1.sendKeys("Bangalore");

        city.sendKeys("Bengaluru");

        Select selectStateElement = new Select(billing_state);
        selectStateElement.selectByVisibleText("Tamil Nadu");

        postCode.sendKeys("641 004");


        phone.sendKeys("8667811103");

        email.sendKeys("hari@quinbay.com");


    }

    public void PlaceOrder(){ order.submit(); }
}
