package com.cbt.utilities;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;
public class TitleVerification2 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList( "https://www.luluandgeorgia.com/", "https://wayfair.com/", "https://walmart.com","https://westelm.com/");

        WebDriver uber=BrowserFactory.getDriver("chrome");
        uber.get("https://google.com");
        // go to "https://lulugandgeorgia.com",
         uber.navigate().to(urls.get(0));
        // "https://lulugandgeorgia.com", get its title
        String urlMain=uber.getCurrentUrl();
        String titleMain=uber.getTitle();// Lulu and Giorgia
        titleMain=titleMain.trim().toLowerCase();
        titleMain= titleMain.replace(" ","");
        System.out.println("titleMain = " + titleMain);
        System.out.println(urlMain);
        if(urlMain.contains(titleMain)){
            System.out.println("PASS");
        }else{
            System.out.println("FALSE");
        }


        uber.navigate().to(urls.get(1));

        String urlMain1= uber.getCurrentUrl();
        String titleMain1=uber.getTitle();
        titleMain1=titleMain1.toLowerCase().replace(" ","");
        System.out.println("titleMain1 = " + titleMain1);



















    }
}
