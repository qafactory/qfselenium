package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Admin on 30.03.15.
 */
public class OpenChrome {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Soft\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://google.com");

        String title = driver.getTitle();
        System.out.println(title);

        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Selenium");
        search.sendKeys(Keys.ENTER);

        Thread.sleep(5000);

        WebElement result = driver.findElement(By.id("rso"));
        WebElement first = result.findElement(By.tagName("a"));
        System.out.println(first.getText());

        List<WebElement> links = result.findElements(By.tagName("a"));

        //show all links text
//        for (int i = 0; i < links.size(); i++){
//            WebElement t = links.get(i);
//            System.out.println(t.getText());
//            System.out.println(t.getAttribute("href"));
//        }

        search.clear();
        search.sendKeys("webdriver");
        WebElement btn = driver.findElement(By.name("btnG"));
        btn.click();



        Thread.sleep(5000);

        driver.quit();



    }
}
