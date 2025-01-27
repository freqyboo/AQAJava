package lesson_13;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    private static final HashMap<String, ArrayList<String>> hash = new HashMap<>();

    public static void add(String surname, String number) {
        hash.computeIfAbsent(surname, String -> new ArrayList<String>()).add(number);
    }

    public static void get(String surname) {
        System.out.println(hash.get(surname));
    }
}
