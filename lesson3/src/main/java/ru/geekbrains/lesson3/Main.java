package ru.geekbrains.lesson3;

public class Main {
    public static void main(String[] args) {

        Apple apple1 = new Apple(3);
        Apple apple2 = new Apple(2);
        Apple apple3 = new Apple(1);

        Orange orange1 = new Orange(3);
        Orange orange2 = new Orange(6);

        Box<Apple> box1 = new Box<Apple>(apple1, apple2, apple3);
        Box<Orange> box2 = new Box<Orange>(orange1, orange2);

        System.out.println(box1.compare(box2));

        Box<Orange> box3 = new Box<Orange>();
        box2.transfer(box3);
    }

}
