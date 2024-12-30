package org.example;
import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
      printThreeWords();
      checkSumSign();
      compareNumbers();
    }
    static void printThreeWords()
    {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void checkSumSign()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        int sum = a+b;
        if(sum>=0)
        {
            System.out.println("Сумма положительная");
        }
        else
        {
            System.out.println("Сумма отрицательная");
        }

    }
    static void compareNumbers()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        if(a>=b)
        {
            System.out.println("a >= b");
        }
        else
        {
            System.out.println("a < b");
        }
    }
}
