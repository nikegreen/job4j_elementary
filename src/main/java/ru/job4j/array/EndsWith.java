package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        if (word.length < post.length) {
            return false;
        }
        int j = word.length - post.length;
        for (int i = 0; i < post.length; i++) {
            if (word[j] != post[i]) {
                return false;
            }
            j++;
        }
        return true;
    }
}
