package lesson_9;

public class Cat extends Animal {

    private int appetite;
    private boolean fullness;
    private static int catCount;

    public boolean getFullness() {
        return fullness;
    }

    public void setFullness(boolean fullness) {
        this.fullness = fullness;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
        animCount++;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.println("Я не смогу столько пробежать");
        } else {
            System.out.println(this.name + " пробежал " + distance + " метров");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Я не умею плавать");
    }

    public static int getCatCount() {
        return catCount;
    }

    public void eat(Plate p) {
        setFullness(p.decreaseFood(appetite));
    }
}