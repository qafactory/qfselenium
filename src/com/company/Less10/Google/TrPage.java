package com.company.Less10.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.company.Less10.TestHelper.driver;

/**
 * Created by Admin on 29.04.15.
 */
public class TrPage {

    public static void open() {
        driver.get("https://translate.google.com/");
    }

    public static void clickTranslate(){
        WebElement btnTranslate = driver.findElement(By.id("gt-submit"));
        btnTranslate.click();
    }

    public static String resultText(){
        WebElement resultArea = driver.findElement(By.xpath("//*[@id='result_box']"));
        return resultArea.getText();
    }

    public static String getTitle(){
        return driver.getTitle();
    }

    public static boolean isLeftArea(){
        WebElement sourceArea = driver.findElement(By.xpath("//*[@id='source']"));
        return sourceArea.isDisplayed();
    }

    public static boolean isRightArea(){
        WebElement sourceArea = driver.findElement(By.xpath("//*[@id='result_box']"));
        return sourceArea.isDisplayed();
    }

    public static boolean isBtnTranslate(){
        WebElement sourceArea = driver.findElement(By.xpath("//*[@id='gt-submit']"));
        return sourceArea.isDisplayed();
    }

}
