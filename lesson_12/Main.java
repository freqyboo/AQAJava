package lesson_12;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            AppData appData = new AppData();
            appData.setHeader(new String[]{"Value 1", "Value 2", "Value 3"});
            appData.setData(new int[][]{
                    {100, 200, 123},
                    {300, 400, 500}
            });

            String fileName = "data.csv";
            appData.save(fileName);

            AppData loadedData = AppData.load(fileName);

            for (String column : loadedData.getHeader()) {
                System.out.print(column + " ");
            }
            System.out.println();
            for (int[] row : loadedData.getData()) {
                for (int value : row) {
                    System.out.print(value + "     ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
