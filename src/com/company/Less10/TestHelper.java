package com.company.Less10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by emma on 4/29/15.
 */
public class TestHelper {

    public static WebDriver driver;

    public static void init() {
        System.setProperty("webdriver.chrome.driver", "/home/emma/Documents/Tools/selenium/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Soft\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

}
