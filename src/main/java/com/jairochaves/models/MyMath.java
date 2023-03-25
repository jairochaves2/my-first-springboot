package com.jairochaves.models;

public class MyMath {
    public Double sum(Double numberOne, Double numberTwo) {
        return (numberOne) + (numberTwo);
    }

    public Double sub(Double numberOne, Double numberTwo) {
        return (numberOne) - (numberTwo);
    }

    public Double mult(Double numberOne, Double numberTwo) {
        return (numberOne) * (numberTwo);
    }

    public Double div(Double numberOne, Double numberTwo) {

        return (numberOne) / (numberTwo);
    }

    public Double avg(Double n1, Double n2) {
        return (n1 + n2) / 2;
    }

    public Double rq(Double numberOne) {
        return Math.sqrt((numberOne));
    }
}
