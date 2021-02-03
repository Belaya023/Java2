package ru.geekbrains.lesson2;

public class Main {
    public static void main(String[] args) {
        String fourArray[][] = {{"1", "2", "3", "4"},
                                {"1", "2", "3", "4"},
                                {"1", "2", "3", "4"},
                                {"1", "2", "3", "4"}
        };

        String[][] wrongSizeArray = new String[][] {{"1", "2", "3"},
                                                    {"1", "2", "3"}
        };

        String[][] wrongDataArray = new String[][] {{"1", "2", "3", "k"},
                                                    {"1", "2", "3", "4"},
                                                    {"1", "2", "3", "k"},
                                                    {"1", "2", "3", "4"}
        };


        ArrayTransform.transform(fourArray);

        System.out.println("");

        ArrayTransform.transform(wrongSizeArray);

        System.out.println("");

        ArrayTransform.transform(wrongDataArray);

    }
}
