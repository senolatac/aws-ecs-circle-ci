package com.example.awsecscircleci.controller;

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
    @GetMapping("/test")
    public String testMethod() {
        return "test method";
    }
}
