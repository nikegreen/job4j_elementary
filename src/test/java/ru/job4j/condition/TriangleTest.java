package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.loop.CheckPrimeNumber;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenAb5Bc5Ca5() {
        double ab = 5;
        double bc = 5;
        double ca = 5;
        boolean result = Triangle.exist(ab, ca, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenAb8Bc5Ca5() {
        double ab = 8;
        double bc = 5;
        double ca = 5;
        boolean result = Triangle.exist(ab, ca, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenAb10Bc5Ca5() {
        double ab = 10;
        double bc = 5;
        double ca = 5;
        boolean result = Triangle.exist(ab, ca, bc);
        Assert.assertFalse(result);
    }

    @Test
    public void whenAb5Bc10Ca5() {
        double ab = 5;
        double bc = 10;
        double ca = 5;
        boolean result = Triangle.exist(ab, ca, bc);
        Assert.assertFalse(result);
    }

    @Test
    public void whenAb5Bc5Ca10() {
        double ab = 5;
        double bc = 5;
        double ca = 10;
        boolean result = Triangle.exist(ab, ca, bc);
        Assert.assertFalse(result);
    }

    @Test
    public void whenAb11Bc5Ca5() {
        double ab = 11;
        double bc = 5;
        double ca = 5;
        boolean result = Triangle.exist(ab, ca, bc);
        Assert.assertFalse(result);
    }

    @Test
    public void whenAb5Bc11Ca5() {
        double ab = 5;
        double bc = 11;
        double ca = 5;
        boolean result = Triangle.exist(ab, ca, bc);
        Assert.assertFalse(result);
    }

    @Test
    public void whenAb5Bc5Ca11() {
        double ab = 5;
        double bc = 5;
        double ca = 11;
        boolean result = Triangle.exist(ab, ca, bc);
        Assert.assertFalse(result);
    }
}