package ru.job4j.array;

import static java.lang.Character.isDigit;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty()
        || !isLowerLatinLetter(name.codePointAt(0))) {
            return false;
        }
        int count = 1;
        while (count < name.length()) {
            int code = name.codePointAt(count++);
            if (!(isLowerLatinLetter(code)
            || isUpperLatinLetter(code)
            || isSpecialSymbol(code)
            || isDigit(code))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
