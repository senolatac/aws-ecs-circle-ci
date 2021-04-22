package com.example.awsecscircleci.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sa
 * @date 21.04.2021
 * @time 15:17
 */
@RestController
public class TestController
{

    @Value("${custom.ecs.variable}")
    private int customEcsVariable;

    @GetMapping("/test")
    public String testMethod() {
        return "test method";
    }

    @GetMapping("/test-1")
    public String test1Method() {
        return "test-1 method";
    }

    @GetMapping("/test-2")
    public String test2Method() {
        return "test-2 method " + customEcsVariable;
    }
}
