package lesson_11;

public class Main {

    public static void main(String[] args) {
        String[][] arr = new String[][] {{"1","2","3"},{"5","6","7","8"},{"9","10","11","12"},{"13","14","15","16"}};

        try {
            System.out.println(ArrayException.arrayException(arr));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

        String[][] arr2 = new String[][] {{"1","2","3","4"},{"5","6","7","8"},{"9","10","11","12"},{"13","14","15","16"}};

        try {
            System.out.println(ArrayException.arrayException(arr2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

        String[][] arr3 = new String[][] {{"1","2","3","%"},{"5","6","7","8"},{"9","10","11","12"},{"13","14","15","16"}};

        try {
            System.out.println(ArrayException.arrayException(arr3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

    }
}
