package com.cbt.utilities;

public class StringUtility {

    public static void verifyEquals(String expected ,String actual){
      if(expected.equals(actual)){
          System.out.println("Pass");
      }else {
          System.out.println("FAIL");
          System.out.println("Actual: "+actual);
          System.out.println("String Expected "+expected);
      }
    }
}
