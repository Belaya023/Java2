package ru.geekbrains.lesson2;

public class ArrayTransform {
    public static void transform(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int[][] intArray = new int[4][4];
        try {
            if (array[0].length == 4 && array.length == 4) {
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        try{
                            if(isInteger(array[i][j])) {
                                intArray[i][j] = Integer.parseInt(array[i][j]);
                            }
                            else{
                                throw new MyArrayDataException(array[i][j], i, j);
                            }
                        }
                        catch(MyArrayDataException e){
                        }
                    }
                }
                summArray(intArray);
            } else {
                throw new MyArraySizeException();
            }
        } catch (MyArraySizeException e){
        }
    }

    private static void summArray(int[][] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                sum += intArray[i][j];
            }
        }
        System.out.println("Общая сумма всех элементов массива = " + sum);
    }
    private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch(Exception e) {
            return false;
        }
    }
}

