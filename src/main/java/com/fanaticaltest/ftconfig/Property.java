package com.fanaticaltest.ftconfig;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//@ComponentScan
//@SpringBootApplication
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

            // load a properties file
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