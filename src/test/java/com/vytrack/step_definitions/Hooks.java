package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {  //https://www.toolsqa.com/cucumber/execution-order-hooks/


    @Before
    public void setUp(){

    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }

    @Before("@db")
    public void setUpdb(){
        System.out.println("\tconnecting to database...");
    }

    @After("@db")
    public void tearDowndb(){
        System.out.println("\tdisconnecting to database...");
    }


    /*
    //Before methodlardan hangisini once acti ise onu en son kapatiyor

    @Before (order = 0)
    public void setUp(){
        System.out.println("\tthis is coming from BEFORE ");
    }

    @After(order = 1)
    public void tearDown(){
        System.out.println("\tthis is coming from AFTER");
    }

    @Before(value = "@db", order = 1)
    public void setUpdb(){
        System.out.println("\tconnecting to database...");
    }

    @After(value = "@db", order = 0)
    public void tearDowndb(){
        System.out.println("\tdisconnecting to database...");
    }

     */


}
