package com.company.last;
import com.company.Less10.Google.TrPage;
import com.company.Less10.TestHelper;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import com.company.Less10.TestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runners.JUnit4;

import static com.company.last.Page.*;


/**
 * Created by Admin on 18.05.15.
 */

@RunWith(JUnit4.class)
public class Smoke {

    @Test
    public void mainFlow(){
        open();
        enterCityFrom("Киев");
        enterCityTo("Ивано-Франковск");
        pickDate();
        clickSearchBtn();

        Assert.assertEquals(2,resultsCount());

        Assert.assertEquals("043 К",firstResult());
        Assert.assertEquals("143 К",secondtResult());





    }













    @After
    public void init() {
        TestHelper.driver.quit();
    }


    @Before
    public void cleanup() {
        TestHelper.init();

    }

}
