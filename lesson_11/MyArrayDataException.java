package lesson_11;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(int row, int col) {
        super("Invalid data in [" + row + "][" + col + "]");
    }
}
