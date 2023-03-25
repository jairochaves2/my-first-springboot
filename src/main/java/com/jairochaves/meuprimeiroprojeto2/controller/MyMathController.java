package com.jairochaves.meuprimeiroprojeto2.controller;

import com.jairochaves.meuprimeiroprojeto2.models.MyMath;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MyMathController {
    @RequestMapping(value = "sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo) {
        return 1D;
    }
}
