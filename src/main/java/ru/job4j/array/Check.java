package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean etalon = data[0];
            for (int index = 1; index < data.length; index++) {
                if (etalon != data[index]) {
                    return false;
                }
            }
        return true;
    }
}