package com.company.Less10;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.company.Less10.GenPage.*;

/**
 * Created by Admin on 29.04.15.
 */
public class Tests {
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


    @After
    public void init() {
        TestHelper.driver.quit();
    }


    @Before
    public void cleanup() {
        TestHelper.init();
        GenPage.open();
    }
}
