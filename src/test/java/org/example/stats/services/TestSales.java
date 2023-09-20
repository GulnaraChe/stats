package org.example.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSales {

    long[] sales = {2, 5, 10, 7, 8, 3, 6, 9, 1, 4, 12, 11};

    @Test
    public void testMin() {
        SalesCalculating service = new SalesCalculating();
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMax() {
        SalesCalculating service = new SalesCalculating();
        int expected = 11;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAllSale() {
        SalesCalculating service = new SalesCalculating();
        int expected = 78;
        double actual = service.allSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        SalesCalculating service = new SalesCalculating();
        double expected = 6.5;
        double actual = service.averageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testAbove() {
        SalesCalculating service = new SalesCalculating();
        int expected = 6;
        int actual = service.aboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBelow() {
        SalesCalculating service = new SalesCalculating();
        int expected = 6;
        int actual = service.belowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
