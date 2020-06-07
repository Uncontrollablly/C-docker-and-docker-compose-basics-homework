package com.thoughtworks.capability.gtb.alice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author yuqi.wang
 * @create 2020-06-07_16:54
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloFromBob() {
        String url = "http://bob:8081/hello";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity responseEntity = restTemplate.getForEntity(url, String.class);

        return responseEntity.getBody().toString();
    }
}
