package lesson_9;

public class Main {

    public static void main(String[] args) {
        Dog Bobik = new Dog("Бобик");
        Bobik.run(499);
        Bobik.swim(10);
        Bobik.run(501);
        Bobik.swim(11);

        Cat Barsik = new Cat("Барсик", 5);
        Barsik.run(200);
        Barsik.swim(1);
        Barsik.run(201);

        Cat Murzik = new Cat("Мурзик", 6);
        System.out.println(Dog.getDogCount());
        System.out.println(Cat.getCatCount());
        System.out.println(Animal.getAnimalCount());

        Plate plate = new Plate(100);
        plate.info();
        Barsik.eat(plate);
        plate.info();

        Cat[] catArr = new Cat[5];
        catArr[0] = Murzik;
        catArr[1] = Barsik;
        catArr[2] = new Cat("Рыжик", 3);
        catArr[3] = new Cat("Леопольд", 10);
        catArr[4] = new Cat("Гарфилд", 50);

        Plate plate2 = new Plate(73);

        for (int i = 0; i < catArr.length; i++) {
            catArr[i].eat(plate2);
            String full = catArr[i].getFullness() ? (" сыт") : (" не сыт");
            System.out.println(catArr[i].name + full);
            plate2.info();
        }
        plate2.addFood(1);
        catArr[4].eat(plate2);
        plate2.info();
    }
}