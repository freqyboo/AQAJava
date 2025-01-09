package lesson_7;

public class AsteriskTask1 {
    public boolean leapYear(int year)
   {
       return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
