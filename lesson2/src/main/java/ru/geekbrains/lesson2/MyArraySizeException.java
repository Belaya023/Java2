package ru.geekbrains.lesson2;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        System.out.println("Некорректный размер массива");
    }
}
