package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Admin on 06.04.15.
 */
public class Less6 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Soft\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://angel.net/~nic/passwd.current.html");


        compare((test(driver, "qwerty", "gmail.com")), "7b9PUQilAz+pd@1a");


        driver.quit();
    }

        public static String test(WebDriver driver, String p, String s){

        WebElement passw = driver.findElement(By.name("master"));
        passw.clear();
        passw.sendKeys(p);

        WebElement site = driver.findElement(By.name("site"));
        site.sendKeys(s);
        site.sendKeys(Keys.ENTER);

        WebElement gPassw = driver.findElement(By.name("password"));

        return gPassw.getAttribute("value");
        }

        public static void compare(String a, String b){
            if(a.equals(b)){
              System.out.println("Passed");
            }else{
              System.out.println("Failed");
            }
        }





}
