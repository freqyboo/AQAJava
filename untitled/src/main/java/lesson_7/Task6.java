package lesson_7;

import java.util.Arrays;

public class Task6 {
    public void fillArray()
    {
        int[] arr = new int[100];
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
