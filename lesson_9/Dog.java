package lesson_9;

public class Dog extends Animal {

    private static int dogCount;
    public Dog(String name) {
        this.name = name;
        animCount++;
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if(distance > 500) {
            System.out.println("Я не смогу столько пробежать");
        } else {
            System.out.println( this.name + " пробежал " + distance + " метров");
        }
    }

    @Override
    public void swim(int distance) {
        if(distance > 10) {
            System.out.println("Я не смогу столько проплыть");
        } else {
            System.out.println( this.name + " проплыл " + distance + " метров");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}
