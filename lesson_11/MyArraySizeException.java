package lesson_11;

public class MyArraySizeException extends Exception {

    public MyArraySizeException() {
        super("Array size must be exactly 4 by 4");
    }
}
