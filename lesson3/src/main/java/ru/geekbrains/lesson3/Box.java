package ru.geekbrains.lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box(T... fruits){
        this.fruits = new ArrayList<T>(Arrays.asList(fruits));
    }

    public void addFruits(T... fruits){
        this.fruits.addAll(Arrays.asList(fruits));
    }

    public void remove(T... fruits) {
        for (T item: fruits) this.fruits.remove(item);
    }

    public ArrayList<T> getItems() {
        return new ArrayList<T>(fruits);
    }

    public void clear() {
        fruits.clear();
    }

    public float getWeight() {
        if (fruits.size() == 0) return 0;
        float weight = 0;
        for (T item: fruits) weight += item.getWeight();
        return weight;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void transfer(Box<? super T> box) {
        box.fruits.addAll(this.fruits);
        clear();
    }

}
