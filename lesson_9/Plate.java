package lesson_9;

public class Plate {

    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if (amount > food) {
            System.out.println("В тарелке мало еды для кота");
            return false;
        } else {
            food -= amount;
            return true;
        }
    }

    public void info() {
        System.out.println("Food amount: " + food);
    }

    public void addFood(int amount) {
        food += amount;
    }
}