package com.fanaticaltest.ftconfig;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class PropertyTest {

    @Test
    public void checkValue()
    {
        Property p = new Property("./src/main/resources/application.properties");
        assertThat(p.read("test.value"),containsString("toto"));
    }
}
