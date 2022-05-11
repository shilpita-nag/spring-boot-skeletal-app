package com.sample.helloworld.controller;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class HelloControllerTest {

    @InjectMocks
    private HelloController helloController;

    @Test
    public void testHelloWorld_Success() {
        String response = helloController.hello();
        assertEquals("Hello World !",response);
    }
}