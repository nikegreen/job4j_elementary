package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] m = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                m[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return m;
    }
}
