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
        log.info ("Open the application - beforeSuite");
    }

    @BeforeClass
    public void beforeClass() {
//        log.info ("Enter and interact with the bank manager - beforeClass");
    }

    @BeforeTest
    public void beforeTest() {
//        log.info (" - beforeTest");
    }

    @BeforeMethod
    public void beforeMethod() {
        log.info ("Had a user in the application or create a new one - beforeMethod");
    }

    @AfterSuite
    public void afterSuite() {
            log.info ("Close the application - afterSuite");
    }

    @AfterClass
    public void afterClass() {
//        log.info ("Put the pen in the desk of the manager - afterClass");
    }

    @AfterTest
    public void afterTest() {
//        log.info (" - afterTest");
    }

    @AfterMethod
    public void afterMethod() {
        log.info ("Log Out - afterMethod");
    }
    @Test(groups = {"Exercise1"})
    public void makeTransactionInATM() {
    	log.info("CREATE ACCOUNT - Test");
    }
    
    @Test(groups = {"Exercise1"})
    public void make2TransactionInATM() {
    	log.info("LOG IN - Test");
    }
    
    @Test(groups = {"Exercise1"})
    public void make3TransactionInATM() {
    	log.info("CANCEL ACCOUNT");
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
