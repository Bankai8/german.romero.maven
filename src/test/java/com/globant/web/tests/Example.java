package com.globant.web.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example {

    public Logger log = Logger.getLogger(Example.class);

    @BeforeSuite
    public void beforeSuite() {
        log.info ("User without account - beforeSuite");
    }

    @BeforeClass
    public void beforeClass() {
        log.info ("Enter and interact with the bank manager - beforeClass");
    }

    @BeforeTest
    public void beforeTest() {
        log.info ("Had the documents and ID to open an account - beforeTest");
    }

    @BeforeMethod
    public void beforeMethod() {
        log.info ("Take a pen to sign the documents - beforeMethod");
    }

    @AfterSuite
    public void afterSuite() {
            log.info ("Leave the bank - afterSuite");
    }

    @AfterClass
    public void afterClass() {
        log.info ("Put the pen in the desk of the manager - afterClass");
    }

    @AfterTest
    public void afterTest() {
        log.info ("Withdraw from the place where the manager is - afterTest");
    }

    @AfterMethod
    public void afterMethod() {
        log.info ("Close new account created - afterMethod");
    }
    @Test(groups = {"Exercise1"})
    public void makeTransactionInATM() {
    	log.info("Open the account by sign the digital documents - Test");
    }
    
    @Test(groups = {"group1", "group2"})
    public void hello () {
        log.info("Hello");
    }

    @Test(groups = {"group1"})
    public void welcome () {
        log.info("Welcome");
    }

    @Test(groups = {"group1"})
    public void goodbye () {
        log.info("Goodbye");
    }

    @Test(groups = {"group2"})
    public void name () {
        log.info("Juan");
    }
}
