package com.jairochaves.meuprimeiroprojeto2.contructors;

import com.jairochaves.meuprimeiroprojeto2.models.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingConstructor {
    private AtomicLong counter = new AtomicLong();
    String template = "Hello %s!";
    @RequestMapping(path = "/greeting")
    public Greeting greeting (@RequestParam(value = "name", defaultValue = "world") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
