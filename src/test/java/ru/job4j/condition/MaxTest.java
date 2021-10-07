package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {
        @Test
        public void whenMax1To2Then2() {
            int left = 1;
            int right = 2;
            int result = Max.max(left, right);
            int expected = 2;
            assertEquals(result, expected);
        }

    @Test
    public void whenMax3To2Then2() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax4To4Then2() {
        int left = 4;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        assertEquals(result, expected);
    }
}