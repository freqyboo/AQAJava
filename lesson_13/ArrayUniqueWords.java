package lesson_13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayUniqueWords {

    public static void countWords(String[] array) {
        Map<String, Integer> hashMap = new HashMap<>();
        for (String word : array) {
            hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
        }
        Set<String> unique = hashMap.keySet();

        System.out.println(unique);
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}