package com.company.Less10;

import org.openqa.selenium.By;

/**
 * Created by emma on 4/29/15.
 */
public class GenPassPage {

    public static void setField(String fieldName, String value){
        TestHelper.driver.findElement(By.xpath("")).sendKeys(value);
    }

    public static void generate(){

    }

    public static String getField(String fieldName) {
        return "";
    }

    public static void open() {
        TestHelper.driver.get("http://oxogamestudio.com/passwd.current4.htm");
    }

}
