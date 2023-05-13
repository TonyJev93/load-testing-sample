package com.tonyjev93.loadtest.loadtesting.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/load-test")
public class LoadTestController {

    @GetMapping("/{value}")
    public String getString(@PathVariable String value) throws InterruptedException {
        Thread.sleep(5000);
        log.info("String({}) returned", value);
        return "String(%s) returned".formatted(value);
    }
}
