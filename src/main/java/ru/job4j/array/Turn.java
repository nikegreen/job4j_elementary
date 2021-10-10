package ru.job4j.array;

import ru.job4j.array.SwitchArray;

public class Turn {
    public static int[] back(int[] array) {
        int end = array.length - 1;
        for (int begin = 0; begin < end; begin++) {
            SwitchArray.swap(array, begin, end);
            end--;
        }
        return array;
    }
}