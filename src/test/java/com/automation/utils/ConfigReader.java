package com.automation.utils;

import java.io.FileReader;
import java.util.Properties;

public class ConfigReader {
    static Properties prop;

    public static void initProperties() {
        try {
            FileReader fr = new FileReader("src/test/resources/configdata.properties");
            prop = new Properties();
            prop.load(fr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        initProperties();
        return prop.getProperty(key);
    }
}
