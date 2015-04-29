package com.company.Less10.Google;

import com.company.Less10.GenPage;
import com.company.Less10.TestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;
import static com.company.Less10.Google.TrPage.*;


/**
 * Created by Admin on 29.04.15.
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
        Assert.assertEquals(true, isLeftArea());
        Assert.assertEquals(true, isRightArea());
        Assert.assertEquals(true, isBtnTranslate());
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
