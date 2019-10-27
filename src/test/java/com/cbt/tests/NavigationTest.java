package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTest {
    public static void main(String[] args) {
        WebDriver GogoGirl=BrowserFactory.getDriver("chrome");
        GogoGirl.get("https://google.com");
        String urlGoogle=GogoGirl.getCurrentUrl();


        GogoGirl.navigate().to("http://etsy.com");
        String  urlEtsy =GogoGirl.getCurrentUrl();


        GogoGirl.navigate().back();

        String backUrlGoogle=GogoGirl.getCurrentUrl();
        StringUtility.verifyEquals(urlGoogle,backUrlGoogle);

        GogoGirl.navigate().forward();
         String forwardUrlEtsy = GogoGirl.getCurrentUrl();
         StringUtility.verifyEquals(forwardUrlEtsy ,urlEtsy);
         GogoGirl.quit();


        GogoGirl = BrowserFactory.getDriver("firefox");
        GogoGirl.get("https://google.com");
        String urlgoogle2 = GogoGirl.getCurrentUrl();



    }

    pablic static Chrome{}

}
