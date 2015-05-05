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
 *
 1. Просто открьіли, нажали Транслейт, проверить что результат пустой.
 2. Проверить что тайтл = Google Translate.
 3. Проверить наличие левого и правого полей и кнопки Транслейт.
 ?  4. Проверить что в правое поле не добавляется текст.
 5. Нажать на стрелочку язьіков проверить наличие Греческого, Мальтийского и Словацкого
 6. Ввести Hello в левое поле, нажать Translate проверить наличие кнопки прослушки.
 7. Открьій ссьілку https://translate.google.com/#auto/en/Hello, проверить что слева Hello, справа перевод.
 8. Слева поставить Spanish, справа English, ввести слева Hello, нажать <>, проверить что справа стало hola
 9. Вводим слева Hello, нажимаем X, проверяем что слева и справа пусто.
 10. Вьібираем слева Укр, справа Китайский, вводим слева С У! Г С!, пр перевод.
 *
 */


@RunWith(JUnit4.class)
public class Tests {

    @Test
    public void Test1(){
       clickTranslate();
       String expected = "";
       Assert.assertEquals(expected, resultText());
    }

    @Test
    public void Test2(){
        String expected = "Google Translate";
        Assert.assertEquals(expected, getTitle());
    }

    @Test
    public void Test3(){
        Assert.assertEquals(true, isSourceArea());
        Assert.assertEquals(true, isResultArea());
        Assert.assertEquals(true, isTranslateBtn());
    }

//    @Test
//    public void Test4(){
//        System.out.println(resultAreaDis());
//    }

    // 5. Нажать на стрелочку язьіков проверить наличие Греческого, Мальтийского и Словацкого
    @Test
    public void Test5(){
        showLanguagesLeft();

        Assert.assertTrue(isLanguagePresentLeft("greek"));
        Assert.assertTrue(isLanguagePresentLeft("maltese"));
        Assert.assertTrue(isLanguagePresentLeft("slovak"));



    }








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
