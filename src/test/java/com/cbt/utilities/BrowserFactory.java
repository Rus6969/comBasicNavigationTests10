package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {
    public static WebDriver getDriver(String browserType){
        WebDriver driver=null;
        switch (browserType.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "safari" :
                driver= new SafariDriver();
                break;
            case "edge":
                driver=null;
                break;
            case "firefox":
                driver=  new FirefoxDriver();
            default:
        }
        return driver;
    }


}
