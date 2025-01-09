package lesson_7;

import java.util.Arrays;

public class Task5 {

    public void arrayZeroOne()
    {
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == 0)
            {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
