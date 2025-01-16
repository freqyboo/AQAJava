package lesson_10;

public class Main {

    public static void main(String[] args) {
        Box<Apple> apples = new Box<>();
        apples.add(new Apple());
        apples.add(new Apple());
        apples.add(new Apple());

        Box<Orange> oranges = new Box<>();
        oranges.add(new Orange());
        oranges.add(new Orange());

        System.out.println("Вес коробки с апельсинами: " + oranges.getWeight());
        System.out.println("Вес коробки с яблоками: " + apples.getWeight());

        System.out.println("Коробки равны по весу: " + apples.compare(oranges));

        Box<Apple> apples2 = new Box<>();
        apples.pourTo(apples2);
        System.out.println(apples2.getWeight());
        System.out.println(apples.getWeight());
    }
}
