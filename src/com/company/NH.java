package com.company;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by emma on 4/30/15.
 */

@RunWith(JUnit4.class)
public class NH {

    public static WebDriver driver;

    @Test
    public void addCookie()
    {
        driver.get("https://ua.newshub.org/");

        //we should pass name and value for cookie as parameters
        // In this example we are passing, name=mycookie and value=123456789123
        Cookie name = new Cookie("u|p", "1328|1ee1b8c18fc9ae517f32ad0f26e09f95");
        driver.manage().addCookie(name);
        driver.get("https://ua.newshub.org/news/");

    }

//    @After //Run after every @Test
//    public void clean(){
//        driver.quit();
//    }

    @Before //Run before every @Test
    public void start(){
        //System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Soft\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "/home/emma/Documents/Tools/selenium/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }

}
