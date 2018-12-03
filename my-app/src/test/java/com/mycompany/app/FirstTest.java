package com.mycompany.app;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

/**
 * Created by Oksana on 03-Dec-18.
 */
public class FirstTest {

    @Test
    public void firstChromeTest(){
        System.setProperty("webdriver.chrome.driver", "C://Users//Oksana//Opt//java-libs//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://todomvc.com/examples/angularjs/#/");

    }
}
