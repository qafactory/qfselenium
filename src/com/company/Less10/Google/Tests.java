package com.company.Less10.Google;

import com.company.Less10.TestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runners.JUnit4;

import static com.company.Less10.Google.TrPage.*;


/**
 * Created by Admin on 29.04.15.

 */


@RunWith(JUnit4.class)
public class Tests {

    //  1. Просто открьіли, нажали Транслейт, проверить что результат пустой.
    @Test
    public void Test1(){
       clickTranslate();
       String expected = "";
       Assert.assertEquals(expected, resultText());
    }

    // 2. Проверить что тайтл = Google Translate.
    @Test
    public void Test2(){
        String expected = "Google Translate";
        Assert.assertEquals(expected, getTitle());
    }

    // 3. Проверить наличие левого и правого полей и кнопки Транслейт.
    @Test
    public void Test3(){
        Assert.assertEquals(true, isSourceArea());
        Assert.assertEquals(true, isResultArea());
        Assert.assertEquals(true, isTranslateBtn());
    }

    // 4. Проверить что в правое поле не добавляется текст.
    @Test
    public void Test4(){
        System.out.println(isResultAreaDis());
    }

    // 5. Нажать на стрелочку язьіков проверить наличие Греческого, Мальтийского и Словацкого
    @Test
    public void Test5(){
        showLanguagesLeft();
        Assert.assertTrue(isLanguagePresentLeft("greek"));
        Assert.assertTrue(isLanguagePresentLeft("maltese"));
        Assert.assertTrue(isLanguagePresentLeft("slovak"));
    }

    // 6. Ввести Hello в левое поле, нажать Translate проверить наличие кнопки прослушки.
    @Test
    public void Test6(){
        enterTxt("hi");
        clickTranslate();
        Assert.assertTrue(isSoundBtnPresent());
    }

    // 7. Открьій ссьілку https://translate.google.com/#auto/en/Hello, проверить что слева Hello, справа перевод.
    @Test
    public void Test7(){
        open("https://translate.google.com/#auto/en/Hello");
        Assert.assertEquals("Hello", sourceText());
        Assert.assertEquals("Hello", resultText());
    }

    // 8. Слева поставить Spanish, справа English, ввести слева Hello, нажать <>, проверить что справа стало hola
    @Test
    public  void Test8(){
        selectSpanishLeft();
        selectEnglishRight();
        enterTxt("Hello");
        switchLangs();
        Assert.assertEquals("¡Hola", resultText());
    }

    // 9. Вводим слева Hello, нажимаем X, проверяем что слева и справа пусто.
    @Test
    public void Test9(){
        enterTxt("Hello");
        clearText();
        Assert.assertEquals("", sourceText());
        Assert.assertEquals("", resultText());
    }

    //  10. Вьібираем слева Укр, справа Китайский, вводим слева С У! Г С!, пр перевод.
    @Test
    public void Test10(){
        selectUkrLeft();
        selectMalayRight();
        enterTxt("С У! Г С!");
        clickTranslate();
        Assert.assertEquals("С У! Г С!", sourceText());
        Assert.assertEquals("Dalam C! Encik C!", resultText());

    }

    // 11. Открьіваем ссьілку https://translate.google.com/#uk/jw/Hello проверяем что слева вьібран Украинский язьік, справа Джаванизский, и что слева и справа "Hello"
    @Test
    public void Test11(){
        open("https://translate.google.com/#uk/jw/Hello");
        Assert.assertTrue(isUrkLeft());
        Assert.assertTrue(isJavanRight());
        Assert.assertEquals("Hello", sourceText());
        Assert.assertEquals("Hello", resultText());

    }

    // 12. Открьіваем сайт, проверяем бьістро доступньіе кнопки язьіков слева и справа.
    @Test
    public void Test12(){
        Assert.assertTrue(isLeftLangsBnts());
        Assert.assertTrue(isRightLangsBnts());

    }


    // 13. //div[contains(@class, 'jfk-button-standar




    @After
    public void init() {
        TestHelper.driver.quit();
    }


    @Before
    public void cleanup() {
        TestHelper.init();
        TrPage.open();
    }
}
