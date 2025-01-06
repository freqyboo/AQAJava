package lesson_7;

import java.util.Arrays;

public class Task8 {
    public void arrSq()
    {
        int[][] squarr = new int[5][5];
        int x = squarr[0].length - 1;
        for (int i = 0; i<5; i++)
        {
            for(int j = 0; j<5; j++)
            {
                if(i == j || j==x)
                {
                    squarr[i][j] = 1;
                }

            }
            x--;
        }
        System.out.println(Arrays.deepToString(squarr));
    }
}
