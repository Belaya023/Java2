package ru.geekbrains.lesson2;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(String message, int a, int b){
        System.out.println("Массив с текстом: " + message + " в ячейке " + a + "-" + b);
    }
}
