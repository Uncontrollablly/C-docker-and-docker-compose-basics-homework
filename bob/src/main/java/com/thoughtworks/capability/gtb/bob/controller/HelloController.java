package com.thoughtworks.capability.gtb.bob.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuqi.wang
 * @create 2020-06-07_16:52
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Bob!";
    }
}
