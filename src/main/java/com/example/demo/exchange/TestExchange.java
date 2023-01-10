package com.example.demo.exchange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;


@HttpExchange(url = "http://127.0.0.1:8080")
public interface TestExchange {

    @GetExchange("/tt/qqq")
    public String qqq();
}
