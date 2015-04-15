package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Admin on 08.04.15.
 */

@RunWith(JUnit4.class)
public class Less7 {

    public static WebDriver driver;

//    @Test
//    public void test2(){
//        int a =10;
//        int b = 5;
//        int expectedResult = 15;
//        Assert.assertEquals("Expected result didn't match.", expectedResult, a+b);
//        Assert.assertTrue(expectedResult == (a+b));
//    }

    @Test
    public void check1(){
        String passw = "Master";
        String site = "gmail.com";
        String expected = "rMX3ydsqop3CR@1a";

        Assert.assertEquals(expected, gen(driver,passw,site));

    }

    @Test
    public void check2(){
        String passw = "12345678";
        String site = "";
        String expected = "9Ixm2r5Xnm41Q@1a";

        Assert.assertEquals(expected, gen(driver,passw,site));
    }

    @Test
    public void check3(){
        String passw = "";
        String site = "gmail.com";
        String expected = "zmcHOAyf2oZm+@1a";

        Assert.assertEquals(expected, gen(driver,passw,site));

    }

    @Test
    public void check4(){
        String passw = "";
        String site = "";
        String expected = "BaefBs8/Z/cm2@1a";

        Assert.assertEquals(expected, gen(driver, passw, site));
    }

    @Test
    public void check5(){
        String passw = "I hate passwords. I mean, I don't mind having really important ones be made-up and memorized but what about all those e-commerce and community sites that want me to create accounts? I end up using the";
        String site = "I hate passwords. I mean, I don't mind having really important ones be made-up and memorized but what about all those e-commerce and community sites that want me to create accounts? I end up using the";
        String expected = "e3yoezzyO9hPR@1a";

        Assert.assertEquals(expected, gen(driver, passw, site));
    }

    @Test
    public void check6(){
        String passw = "!@#$%^&*(*&^%$#@!";
        String site = "!@#$%^&*(*&^%$#@!";
        String expected = "n9KKzvyHEEGsz@1a";

        Assert.assertEquals(expected, gen(driver, passw, site));
    }

    @Test
    public void btnText() {
        WebElement btn = driver.findElements(By.tagName("input")).get(2);
        Assert.assertEquals("Generate", btn.getAttribute("value"));

    }

    @Test
    public void titleP() {
        Assert.assertEquals("Password generator", driver.getTitle());

    }


    //Homework
    @Test
    public void homework(){
        master("12345678");
        site("gmail.com");
        generate();
        System.out.println(password());
        System.out.println(master());// 12345678
        System.out.println(site()); // gmail.com
        System.out.println(title()); // Password generator
        System.out.println(button()); // Generate
        site("");
        generate();
        System.out.println(password()); // 9Ixm2r5Xnm41Q@1a

    }


    public static String gen(WebDriver driver, String p, String s){
        WebElement passw = driver.findElement(By.name("master"));
        passw.clear();
        passw.sendKeys(p);

        WebElement site = driver.findElement(By.name("site"));
        site.sendKeys(s);
        site.sendKeys(Keys.ENTER);

        WebElement gPassw = driver.findElement(By.name("password"));

        return gPassw.getAttribute("value");
    }

    public static void master(String p){
        WebElement passw = driver.findElement(By.name("master"));
        passw.clear();
        passw.sendKeys(p);
    }

    public static void site(String s){
        WebElement site = driver.findElement(By.name("site"));
        site.clear();
        site.sendKeys(s);

    }

    public static void generate(){
        WebElement site = driver.findElement(By.name("site"));
        site.sendKeys(Keys.ENTER);
    }

    public static String password(){
        WebElement gPassw = driver.findElement(By.name("password"));
        return gPassw.getAttribute("value");

    }

    public static String master(){
        WebElement passw = driver.findElement(By.name("master"));
        return passw.getAttribute("value");
    }

    public static String site(){
        WebElement site = driver.findElement(By.name("site"));
        return site.getAttribute("value");
    }

    public static String title(){
        return driver.getTitle();
    }

    public static String button(){
        WebElement btn = driver.findElements(By.tagName("input")).get(2);
        return btn.getAttribute("value");
    }


    @After //Run after every @Test
    public void clean(){
        driver.quit();
    }

    @Before //Run before every @Test
    public void start(){
        //System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Soft\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "/home/emma/Documents/Tools/selenium/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://angel.net/~nic/passwd.current.html");
    }



}
