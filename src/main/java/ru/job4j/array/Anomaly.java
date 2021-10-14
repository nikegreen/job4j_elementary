package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int count = 0;
        int res0;
        int res1;
        int resSize = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= up || data[i] <= down) {
                if (resSize == 0) {
                    res0 = i;
                    resSize = 1;
                    result[count] = new int[2];
                    result[count][0] = res0;
                }
                if (i == data.length - 1) {
                    res1 = i;
                    result[count++][1] = res1;
                }
            } else {
                if (resSize > 0) {
                    res1 = i - 1;
                    result[count++][1] = res1;
                    resSize = 0;
                }
            }
        }
        return Arrays.copyOf(result, count);
    }
}