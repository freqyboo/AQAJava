package lesson_7;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var x = scanner.nextInt();
        var y = scanner.nextInt();
        Task1 fObj = new Task1();
        System.out.println(fObj.checkSum(x, y));

        Task2 sObj = new Task2();
        x = scanner.nextInt();
        sObj.checkPositive(x);

        Task3 tObj = new Task3();
        x = scanner.nextInt();
        System.out.println(tObj.checkPositive(x));

        Task4 fhObj = new Task4();
        x = scanner.nextInt();
        String s = scanner.nextLine();
        fhObj.typeString(x, s);

        AsteriskTask1 spObj = new AsteriskTask1();
        x = scanner.nextInt();
        System.out.println(spObj.leapYear(x));

        Task5 fiObj = new Task5();
        fiObj.arrayZeroOne();

        Task6 sxObj = new Task6();
        sxObj.fillArray();

        Task7 svObj = new Task7();
        svObj.arrayLessThanSix();

        Task8 egObj = new Task8();
        egObj.arrSq();

        Task9 niObj = new Task9();
        System.out.println(Arrays.toString(niObj.createArray(5, 7)));

        AsteriskTask2 sp2Obj = new AsteriskTask2();
        System.out.println("Введите длинну массива");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i =0; i<length; i++)
        {
            System.out.println("Введите "+ (i+1) + " число массива");
            array[i] = scanner.nextInt();
        }
        System.out.println("Введите число сдвига");
        int n = scanner.nextInt();
        sp2Obj.circusArr(array, n);
    }

}