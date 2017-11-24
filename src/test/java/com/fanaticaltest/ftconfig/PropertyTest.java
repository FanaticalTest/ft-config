package com.fanaticaltest.ftconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertyTest {

    @Test
    public void checkValue()
    {
        Property p = new Property("./src/main/resources/application.properties");
        assertThat(p.read("test.value"),containsString("toto"));
    }
}
