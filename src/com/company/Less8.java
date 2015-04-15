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
public class Less8 {

    public static WebDriver driver;

    @Test
    public void check1(){
        master("Master");
        site("gmail.com");
        generate();
        String expected = "rMX3ydsqop3CR@1a";
        Assert.assertEquals(expected, password());

    }

    @Test
    public void check2(){
        master("12345678");
        site("");
        generate();
        String expected = "9Ixm2r5Xnm41Q@1a";
        Assert.assertEquals(expected, password());
    }

    @Test
    public void check3(){
        master("");
        site("gmail.com");
        String expected = "zmcHOAyf2oZm+@1a";
        generate();
        Assert.assertEquals(expected, password());

    }

    @Test
    public void check4(){
        master("");
        site("");
        generate();
        String expected = "BaefBs8/Z/cm2@1a";
        Assert.assertEquals(expected, password());
    }

    @Test
    public void check5(){
        master("I hate passwords. I mean, I don't mind having really important ones be made-up and memorized but what about all those e-commerce and community sites that want me to create accounts? I end up using the");
        site("I hate passwords. I mean, I don't mind having really important ones be made-up and memorized but what about all those e-commerce and community sites that want me to create accounts? I end up using the");
        generate();
        String expected = "e3yoezzyO9hPR@1a";
        Assert.assertEquals(expected, password());
    }

    @Test
    public void check6(){
        master("!@#$%^&*(*&^%$#@!");
        site("!@#$%^&*(*&^%$#@!");
        generate();
        String expected = "n9KKzvyHEEGsz@1a";
        Assert.assertEquals(expected, password());
    }

    @Test
    public void check7(){
        master("Master");
        site("gmail.com");
        generate();
        Assert.assertEquals("Master",master());
        Assert.assertEquals("gmail.com",site());
    }

    @Test
    public void enabledFields(){
        master("Master");
        site("gmail.com");
        generate();
        Assert.assertEquals("Master field is not enabled",true, masterIsEnabled());
        Assert.assertEquals("Site field is not enabled",true, siteIsEnabled());
        Assert.assertEquals("Generated field is not enabled",true, passwIsEnabled());
    }

    @Test
    public void fieldNames(){
        Assert.assertEquals("Your master password", masterText());
        Assert.assertEquals("Site name", siteText());
        Assert.assertEquals("Generated password", passwText());
    }

    @Test
    public void btnText() {
        Assert.assertEquals("Generate", button());
    }

    @Test
    public void titleText() {
        Assert.assertEquals("Password generator", title());
    }


    public static void master(String p){
        WebElement master = driver.findElements(By.tagName("input")).get(0);
        master.clear();
        master.sendKeys(p);
    }

    public static void site(String s){
        WebElement site = driver.findElements(By.tagName("input")).get(1);
        site.clear();
        site.sendKeys(s);

    }

    public static void generate(){
        WebElement site = driver.findElements(By.tagName("input")).get(1);
        site.sendKeys(Keys.ENTER);
    }

    public static String password(){
        WebElement gPassw = driver.findElements(By.tagName("input")).get(3);
        return gPassw.getAttribute("value");

    }

    public static String master(){
        WebElement master = driver.findElements(By.tagName("input")).get(0);
        return master.getAttribute("value");
    }


    public static String site(){
        WebElement site = driver.findElements(By.tagName("input")).get(1);
        return site.getAttribute("value");
    }

    public static String title(){
        return driver.getTitle();
    }

    public static String button(){
        WebElement btn = driver.findElements(By.tagName("input")).get(2);
        return btn.getAttribute("value");
    }

    public static String masterText(){
        WebElement master = driver.findElements(By.tagName("td")).get(0);
        return master.getText();
    }

    public static String siteText(){
        WebElement site = driver.findElements(By.tagName("td")).get(2);
        return site.getText();
    }

    public static String passwText(){
        WebElement passw = driver.findElements(By.tagName("td")).get(5);
        return passw.getText();
    }

    public static boolean masterIsEnabled(){
        WebElement master = driver.findElements(By.tagName("input")).get(0);
        return master.isEnabled();
    }

    public static boolean siteIsEnabled(){
        WebElement site = driver.findElements(By.tagName("input")).get(1);
        return site.isEnabled();
    }

    public static boolean passwIsEnabled(){
        WebElement passw = driver.findElements(By.tagName("input")).get(3);
        return passw.isEnabled();
    }


    @After //Run after every @Test
    public void clean(){
        driver.quit();
    }

    @Before //Run before every @Test
    public void start(){
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Soft\\chromedriver_win32\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "/home/emma/Documents/Tools/selenium/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://oxogamestudio.com/passwd.current6.htm");
    }


}
