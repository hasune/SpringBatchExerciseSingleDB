package com.example.batch.batchsample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;

@SpringBootTest
public class ValueTest {

    @Value("${app.value1}")
    private String value1;

    @Value("${app.value2}")
    private String value2;

    @Test
    public void test_values() {



        assertEquals("hello", value1);
        assertEquals("world", value2);

    }
}
