package com.company.Less10;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by emma on 4/29/15.
 */
  @RunWith(JUnit4.class)
    public class L_Tests {

        @Test
        public void refactoredTest() {
            L_GenPassPage.setField("Your master password", "12345678");
            L_GenPassPage.setField("Site name", "gmail.com");
            L_GenPassPage.generate();
            String pwd = L_GenPassPage.getField("Generated password");
            Assert.assertEquals("W3Hdka0clbEI+@1a", pwd);
        }


        @After
        public void init() {
            TestHelper.driver.quit();
        }


        @Before
        public void cleanup() {
            L_GenPassPage.open();
        }

    }

