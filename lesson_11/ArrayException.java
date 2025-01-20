package lesson_11;

import java.util.Arrays;

public class ArrayException {

    public static int arrayException(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}