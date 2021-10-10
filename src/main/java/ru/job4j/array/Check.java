package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean etalon = data[0];
        for (boolean element : data) {
            if (etalon != element) {
                return false;
            }
        }
        return true;
    }
}