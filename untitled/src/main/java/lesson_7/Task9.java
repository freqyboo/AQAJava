package lesson_7;

import java.util.Arrays;

public class Task9 {
    public int[] createArray(int len, int InitialValue)
    {
        int[] arr = new int[len];
        Arrays.fill(arr, InitialValue);
        return arr;
    }
}
