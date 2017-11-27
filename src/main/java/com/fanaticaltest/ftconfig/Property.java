package com.fanaticaltest.ftconfig;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Property {

    private String pathFile;

    public Property(String pathFile) {
        this.pathFile = pathFile;
    }

    public String read(String value) {
        Properties prop = new Properties();
        InputStream input = null;

        String propertyValue = "";

        try {

            input = new FileInputStream(pathFile);

            prop.load(input);

            propertyValue = prop.getProperty(value);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return propertyValue;
    }

}