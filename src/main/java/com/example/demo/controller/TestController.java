package com.example.demo.controller;

import com.example.demo.exchange.TestExchange;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tt")
public class TestController {
    @PostConstruct
    public void bb(){
        System.out.println("123");
    }

    @Autowired
    private TestExchange testExchange;

    @GetMapping("/aa")
    public String aa(){
        String aa = testExchange.qqq();
        System.out.println(aa);
        return "1";
    }

    @GetMapping("/qqq")
    public String proxy(){
        return "proxy";
    }
}
