package com.automation.stepDefs;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
    @Before
    public void setUp(){
        ConfigReader.initProperties();
        DriverUtils.createDriver();
    }
    @After
    public void quit(){
        DriverUtils.getDriver().quit();
    }
}
