package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP24K1Square36() {
        int expected = 36;
        int p = 24;
        double k = 1;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP18K2Square18() {
        int expected = 18;
        int p = 18;
        double k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}