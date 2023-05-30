package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RestCalculationTest {

    @Test
    public void testIncome10Expenses3Threshold20() {
        RestCalculation service = new RestCalculation();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testIncome100Expenses60Threshold150() {
        RestCalculation service = new RestCalculation();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);

    }

}