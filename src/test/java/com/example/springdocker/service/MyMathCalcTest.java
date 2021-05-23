package com.example.springdocker.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathCalcTest {

    MyMathCalc mmc;

    @BeforeEach
    public void init() {
        mmc = new MyMathCalc();
    }

    @Test
    void add() {
        int expected = 3;
        int actual = mmc.add(2,1);
        assertEquals(expected,actual);
    }

    @Test
    void multiply() {
        int expected = 4;
        int actual = mmc.multiply(2,2);
        assertEquals(expected,actual);
    }

    @Test
    void divide() {
        double expected = 3;
        double actual = mmc.divide(6,2);
        assertEquals(expected,actual);
    }

    @Test
    void divide_throws() {
        assertThrows(ArithmeticException.class, () -> mmc.divide(1,0));
    }
}