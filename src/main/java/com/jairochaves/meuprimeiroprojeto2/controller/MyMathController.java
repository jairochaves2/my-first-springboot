package com.jairochaves.meuprimeiroprojeto2.controller;

import com.jairochaves.meuprimeiroprojeto2.models.MyMath;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MyMathController {
    private AtomicLong counter = new AtomicLong();
    String template = "Hello %s!";
    @RequestMapping(path = "/greeting")
    public MyMath greeting (@RequestParam(value = "name", defaultValue = "world") String name){
        return new MyMath(counter.incrementAndGet(), String.format(template, name));
    }
}
