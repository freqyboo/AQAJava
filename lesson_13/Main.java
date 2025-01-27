package lesson_13;


public class Main {

    public static void main(String[] args) {
        String[] wordArr = new String[]{"Dog", "Mouse", "Cat", "Fox", "Rat", "Bird", "Parrot", "Chicken", "Cat", "Bird", "Fox", "Sparrow"};
        ArrayUniqueWords.countWords(wordArr);
        PhoneBook.add("Abibullayev", "+77775552255");
        PhoneBook.add("Abibullayev", "+77775532255");
        PhoneBook.add("Kuznetsov", "+77773332222");
        PhoneBook.add("Ivanov", "+77773233222");
        PhoneBook.get("Ivanov");
        PhoneBook.get("Abibullayev");
    }

}