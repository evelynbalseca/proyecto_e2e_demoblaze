package com.demoblaze.configs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class WebDriverManager {

    public static WebDriver driver;

    public static WebDriver getDriver()
    {


        if(driver == null)
        {
            System.setProperty("webdriver.chrome.driver","src\\test\\resources\\webdrivers\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");


            driver = new ChromeDriver(options);




        }
        return driver;
    }

}
