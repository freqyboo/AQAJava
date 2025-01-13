package lesson_9;

public abstract class Animal {

    protected String name;
    protected static int animCount;

    protected abstract void run(int distance);

    protected abstract void swim(int distance);

    public static int getAnimalCount() {
        return animCount;
    }
}