package lesson_12;

import java.io.*;
import java.util.*;


public class AppData {

    private String[] header;
    private int[][] data;

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public void save(String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(String.join(";", header));
            writer.newLine();

            for (int[] row : data) {
                StringBuilder rowBuilder = new StringBuilder();
                for (int i = 0; i < row.length; i++) {
                    rowBuilder.append(row[i]);
                    if (i < row.length - 1) {
                        rowBuilder.append(";");
                    }
                }
                writer.write(rowBuilder.toString());
                writer.newLine();
            }
        }
    }

    public static AppData load(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String headerLine = reader.readLine();
            if (headerLine == null) {
                throw new IOException("CSV file is empty");
            }

            String[] header = headerLine.split(";");
            List<int[]> dataList = new ArrayList<>();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] stringValues = line.split(";");
                int[] intValues = new int[stringValues.length];
                for (int i = 0; i < stringValues.length; i++) {
                    intValues[i] = Integer.parseInt(stringValues[i]);
                }
                dataList.add(intValues);
            }

            int[][] data = dataList.toArray(new int[0][]);
            AppData appData = new AppData();
            appData.setHeader(header);
            appData.setData(data);

            return appData;
        }
    }
}