package com.trendyol.qualitymeasurementsample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    private static final String TEST_MESSAGE = "Hello Sonar!";

    @GetMapping
    public String getTestMessage() {
        return TEST_MESSAGE;
    }

}
