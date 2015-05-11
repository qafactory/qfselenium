package com.company.Less10.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static com.company.Less10.TestHelper.driver;

/**
 * Created by Admin on 29.04.15.
 */
public class TrPage {

    static List<String> languagesLeft = new ArrayList<String>();

    public static WebDriverWait wait = new WebDriverWait(driver, 10);

    public static void open() {

        driver.get("https://translate.google.com/");
    }
    public static void open(String url) {

        driver.get(url);
    }


    public static void clickTranslate() {
        WebElement btnTranslate = driver.findElement(By.id("gt-submit"));
        btnTranslate.click();
    }

    public static String sourceText() {
        WebElement sourceArea = driver.findElement(By.xpath("//*[@id='source']"));
        return sourceArea.getAttribute("value");
    }

    public static String resultText() {
        WebElement resultArea = driver.findElement(By.xpath("//*[@id='result_box']"));
        return resultArea.getText();
    }

    public static String getTitle() {
        return driver.getTitle();
    }

    public static boolean isSourceArea() {
        WebElement sourceArea = driver.findElement(By.xpath("//*[@id='source']"));
        return sourceArea.isDisplayed();
    }

    public static boolean isResultArea() {
        WebElement resultArea = driver.findElement(By.xpath("//*[@id='result_box']"));
        return resultArea.isDisplayed();
    }

    public static boolean isResultAreaDis() {
        WebElement resultArea = driver.findElement(By.xpath("//*[@id='result_box']"));
        return resultArea.isEnabled();
    }

    public static boolean isTranslateBtn() {
        WebElement sourceArea = driver.findElement(By.xpath("//*[@id='gt-submit']"));
        return sourceArea.isDisplayed();
    }

    public static void showLanguagesLeft() {
        WebElement langArrow = driver.findElement(By.xpath("//*[@id='gt-sl-gms']"));
        langArrow.click();
    }

    public static List<String> languageListLeft() {

        WebElement dropdown = driver.findElement(By.xpath("//*[@id='gt-sl-gms-menu']"));

        List<WebElement> langs = dropdown.findElements(By.xpath("//div[@class='goog-menuitem-content']"));

        for (int i = 0; i < langs.size(); i++) {
            String text = langs.get(i).getText().trim().toLowerCase();
            languagesLeft.add(text);
        }

        return languagesLeft;

    }

    public static void showLanguagesRight() {
        WebElement langArrow = driver.findElement(By.xpath("//*[@id='gt-tl-gms']"));
        langArrow.click();
    }

    public static boolean isLanguagePresentLeft(String lang) {
        lang = lang.trim().toLowerCase();

        languageListLeft();

        for (String str : languagesLeft)
        {
            if (str.contains(lang)) {
                return true;
            }
        }

        return false;

    }

    public static void enterTxt(String txt) {
        WebElement sourceArea = driver.findElement(By.xpath("//*[@id='source']"));
        sourceArea.clear();
        sourceArea.sendKeys(txt);
    }

    public static boolean isSoundBtnPresent() {
        WebElement soundBtn = driver.findElement(By.xpath("//*[@id='gt-res-listen']")).findElement(By.xpath("span"));
        wait.until(ExpectedConditions.visibilityOf(soundBtn));

        return soundBtn.isDisplayed();

    }

    public static void selectSpanishLeft() {
        WebElement btnSpanishLeft = driver.findElement(By.xpath("//div[@id='gt-sl-sugg']/div[@value='es']"));
        btnSpanishLeft.click();
    }

    public static void selectEnglishRight() {
        WebElement btnEnglishRight = driver.findElement(By.xpath("//div[@id='gt-tl-sugg']/div[@value='en']"));
        btnEnglishRight.click();
    }

    public static void switchLangs() {
        WebElement btnSwitchLangs = driver.findElement(By.xpath("//div[@id='gt-swap']"));
        btnSwitchLangs.click();
    }

    public static void clearText() {
        WebElement btnClearText = driver.findElement(By.xpath("//div[@id='gt-clear']/span"));
        btnClearText.click();

    }

    public static void selectUkrLeft(){
        showLanguagesLeft();
        WebElement btnUrk = driver.findElement(By.xpath("//div[@id=':2c']"));
        btnUrk.click();
    }

    public static void selectMalayRight(){
        showLanguagesRight();
        WebElement btnMalay = driver.findElement(By.xpath("//div[@id=':42']"));
        btnMalay.click();

    }

    public static boolean isUrkLeft(){
        WebElement btnUkrLeft = driver.findElement(By.xpath("//*[@id='gt-sl-sugg']/div[@value='uk']"));
        return btnUkrLeft.isDisplayed();
    }

    public static boolean isJavanRight(){
        WebElement btnJavanRight = driver.findElement(By.xpath("//*[@id='gt-tl-sugg']/div[@value='jw']"));
        return btnJavanRight.isDisplayed();
    }

    public static boolean isLeftLangsBnts(){
        WebElement leftLangsBnts = driver.findElement(By.xpath("//*[@id='gt-sl-sugg']"));
        return leftLangsBnts.isDisplayed();
    }

    public static boolean isRightLangsBnts(){
        WebElement rightLangsBnts = driver.findElement(By.xpath("//*[@id='gt-tl-sugg']"));
        return rightLangsBnts.isDisplayed();
    }


}


