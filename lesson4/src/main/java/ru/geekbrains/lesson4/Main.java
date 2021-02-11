package ru.geekbrains.lesson4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Задание 1: Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        // Посчитать, сколько раз встречается каждое слово.
        List<String> wordArray = Arrays.asList("Вася", "Петя", "Даша", "Катя", "Ульяна", "Костя",
                "Наташа", "Рома", "Катя", "Антон", "Рома", "Юля", "Вася", "Ксюша", "Костя", "Лев",
                "Максим", "Ира", "Света", "Петя");
        Set<String> uniqWords = new HashSet<String>(wordArray);
        System.out.println(uniqWords);
        Map<String, Integer> countWords = new HashMap<String, Integer>();
        for (String c : wordArray) {
            if (!countWords.containsKey(c)){
                countWords.put(c, 1);
            } else {
                countWords.put(c, countWords.get(c) + 1);
            }
        }
        System.out.println(countWords);

        //Задание 2: Написать простой класс Телефонный Справочник, который хранит в себе
        // список фамилий и телефонных номеров. В этот телефонный справочник с помощью
        // метода add() можно добавлять записи, а с помощью метода get() искать номер
        // телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько
        // телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны
        // выводиться все телефоны. Желательно не добавлять лишний функционал
        // (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем
        // через консоль и т.д). Консоль использовать только для вывода результатов проверки
        // телефонного справочника.
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("1", "A");
        phoneBook.add("2", "B");
        phoneBook.add("3", "C");
        phoneBook.add("4", "A");
        phoneBook.add("5", "B");
        phoneBook.add("6", "C");

        //phoneBook.info();

        System.out.println(phoneBook.get("A"));

    }
}
