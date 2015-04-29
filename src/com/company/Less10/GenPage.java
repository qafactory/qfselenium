package com.company.Less10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

 import static com.company.Less10.TestHelper.*;

/**
 * Created by Admin on 29.04.15.
 */
public class GenPage {

    public static void open() {
        driver.get("http://oxogamestudio.com/passwd.current4.htm");
    }

    public static void master(String p){
        WebElement master = driver.findElement(By.xpath("//input[@type='password']"));
        master.clear();
        master.sendKeys(p);
    }

    public static void site(String s){
        WebElement site = driver.findElement(By.xpath("//tr[2]/td[2]/input"));
        site.clear();
        site.sendKeys(s);

    }

    public static void generate(){
        WebElement btnG = driver.findElement(By.xpath("//input[@type='submit']"));
        if(btnG.isDisplayed()){
            btnG.click();
        }
        else {
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // wait cycle
    public static String password(){
        WebElement passw = driver.findElement(By.xpath("//tr[4]/td/input"));
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return passw.getAttribute("value");
    }

    public static String master(){
        WebElement master = driver.findElement(By.xpath("//input[@type='password']"));
        return master.getAttribute("value");
    }


    public static String site(){
        WebElement site = driver.findElement(By.xpath("//tr[2]/td[2]/input"));
        return site.getAttribute("value");
    }

    public static String title(){
        return TestHelper.driver.getTitle();
    }

    public static String button(){
        WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
        return btn.getAttribute("value");
    }

    public static String masterText(){
        WebElement master = driver.findElement(By.xpath("//tr[1]/td[1]"));
        return master.getText();
    }

    public static String siteText(){
        WebElement site = driver.findElement(By.xpath("//tr[2]/td[1]"));
        return site.getText();
    }

    public static String passwText(){
        WebElement passw = driver.findElement(By.xpath("//tr[4]/td[1]"));
        return passw.getText();
    }

    public static boolean masterIsEnabled(){
        WebElement master = driver.findElement(By.xpath("//input[@type='password']"));
        return master.isEnabled();
    }

    public static boolean siteIsEnabled(){
        WebElement site = driver.findElement(By.xpath("//tr[2]/td[2]/input"));
        return site.isEnabled();
    }

    public static boolean passwIsEnabled(){
        WebElement passw = driver.findElement(By.xpath("//tr[4]/td/input"));
        return passw.isEnabled();
    }
}
