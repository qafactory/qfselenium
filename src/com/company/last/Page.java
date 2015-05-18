package com.company.last;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static com.company.Less10.TestHelper.driver;

/**
 * Created by Admin on 18.05.15.
 */
public class Page {

    public static WebDriverWait wait = new WebDriverWait(driver, 30);

    public static void open() {

        driver.get("http://booking.uz.gov.ua/ru/");
    }

    public static void enterCityFrom(String city) {
        WebElement fromField = driver.findElement(By.xpath("//div[@id='station_from']/input"));
        fromField.clear();
        fromField.sendKeys(city);
        wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//div[@title = 'Киев']")))).click();
    }

    public static void enterCityTo(String city) {
        WebElement fromField = driver.findElement(By.xpath("//div[@id='station_till']/input"));
        fromField.clear();
        fromField.sendKeys(city);
        wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//div[@title = 'Ивано-Франковск']")))).click();
    }

    public static void pickDate(){
        WebElement dateField = driver.findElement(By.xpath("//input[@id = 'date_dep']"));
        dateField.click();
        wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//caption[text()='Июнь 2015']/..//td[text()='20']")))).click();

    }



    public static void clickSearchBtn() {
        WebElement searchField = driver.findElement(By.xpath("//button[@name = 'search']"));
        searchField.click();
    }

    public  static  int resultsCount(){
        String res = "//table[@id='ts_res_tbl']/tbody/tr";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(res)));
        List<WebElement> results = driver.findElements(By.xpath(res));
        return results.size();
    }

    public static String firstResult(){
        WebElement searchField = driver.findElement(By.xpath("//table[@id='ts_res_tbl']/tbody/tr[1]/td/a"));
        return searchField.getText();
    }

    public static String secondtResult(){
        WebElement searchField = driver.findElement(By.xpath("//table[@id='ts_res_tbl']/tbody/tr[2]/td/a"));
        return searchField.getText();

    }












}
