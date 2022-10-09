package com.automation.stepDefs;

import com.automation.utils.DriverUtils;
import org.junit.After;
import org.junit.Before;

public class Hooks {
    @Before
    public void setUp() throws Exception{
        DriverUtils.createDriver();
    }
    @After
    public void CleanUP(){
        System.out.println("After each scenario");
    }
}
