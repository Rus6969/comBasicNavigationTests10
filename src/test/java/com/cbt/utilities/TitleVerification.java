package com.cbt.utilities;


import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) {
        List<String>urls= Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        //import driver
        WebDriver uber=BrowserFactory.getDriver("chrome");
        // go to google
        uber.get("https://google.com");
        // go there
         uber.navigate().to("http://practice.cybertekschool.com/");
         //assign title
         String title1= uber.getTitle();
         //go there
         uber.navigate().to("http://practice.cybertekschool.com/dropdown");
         //asign second title
         String title2=uber.getTitle();
         // go there
         uber.navigate().to("http://practice.cybertekschool.com/login");
         // asign third title
         String title3=uber.getTitle();
//         if (title1.equalsIgnoreCase(title2) && title1.equalsIgnoreCase(title3)){
//            System.out.println("PASS");
//        }
        // check their equality
        StringUtility.verifyEquals(title1,title2);
        StringUtility.verifyEquals(title3,title1);

         uber.navigate().to("http://practice.cybertekschool.com/");
         // get this url
         String url1practice=uber.getCurrentUrl();

         uber.navigate().to("http://practice.cybertekschool.com/dropdown");
         String url2dropdown=uber.getCurrentUrl();

         uber.navigate().to("http://practice.cybertekschool.com/login");
         String url2Login=uber.getCurrentUrl();

         if(url1practice.startsWith("http://practice.cybertekschool.com")
                 && url2dropdown.startsWith("http://practice.cybertekschool.com")
                 && url2Login.startsWith("http://practice.cybertekschool.com")){
             System.out.println("PASS");
         }else{
             System.out.println("FAIL");
         }

         uber.quit();


    }
}
