package com.quinbay.qa.training.test;

import com.quinbay.qa.training.Actions.Actions;
import com.quinbay.qa.training.Actions.HomePageActions;
import com.quinbay.qa.training.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FirstSeleniumExample {

    public static void main(String[] args) throws InterruptedException {


//        Page page = new Page();


        System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.edgewordstraining.co.uk/demo-site/");

        Thread.sleep(3000);


        Actions actions = new Actions(driver);

        actions.searchForAnItem("tshirt");
        actions.AddToCart();
        actions.CheckOut();

        actions.Add_Details();
        actions.Payment(driver);
        actions.PlaceOrder();



//        WebElement element = driver.findElement(By.xpath("//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/vneck-tee.jpg']"));
//
//        if(!element.isDisplayed()) System.out.println("Element not found");
//        else System.out.println("Element Found");






        System.out.println("Success");


        Thread.sleep(10000);
    }

}
