package lesson_7;

import java.util.Arrays;

public class AsteriskTask2 {
    public void circusArr(int[] array, int n)
    {
        if (array == null || array.length == 0) {
            return;
        }
        if(n==0)
        {
            System.out.println(Arrays.toString(array));
        }
        int length = array.length;
        n = n % length;
        if (n < 0) {
            n += length;
        }

        for (int i = 0; i < n; i++) {
            int last = array[length - 1];
            for (int j = length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = last;
        }
        System.out.println(Arrays.toString(array));
    }
}
