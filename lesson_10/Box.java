package lesson_10;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> box = new ArrayList<>();

    public void add(T fruit) {
        box.add(fruit);
    }

    public float getWeight() {
        float size = this.box.size();
        if (size == 0) {
            return 0;
        } else {
            return size * box.get(0).getWeight();
        }
    }

    public boolean compare(Box<?> secondBox) {
        return this.getWeight() == secondBox.getWeight();
    }

    public void pourTo(Box<T> secondBox) {
        secondBox.box.addAll(this.box);
        this.box.clear();
    }
}
