package com.example.springdocker.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyMathCalc {

    public int add(int a, int b){
        return a+b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int divide(int a, int b){
        if(b!=0){
            return a/b;
        } else {
            throw new ArithmeticException("Cant divide by zero!");
        }
    }
}
