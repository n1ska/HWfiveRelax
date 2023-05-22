package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RelaxWorkCalculatorTest {
    public void testCorrectRelaxMonth() {
        RelaxWorkCalculator calc = new RelaxWorkCalculator();

        int actual = calc.calculateRelaxMonth(100_000, 60_000, 150_000);

        Assertions.assertEquals(2, actual);
    }
}