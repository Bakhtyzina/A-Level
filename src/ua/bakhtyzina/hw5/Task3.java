package ua.bakhtyzina.hw5;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        fillRandomArray(array);
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        int[][] newArray = swapRowsAndColumns(array);
        System.out.println("New array: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(Arrays.toString(newArray[i]));
        }
    }

    private static void fillRandomArray(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(20);
            }
        }
    }

    private static int[][] swapRowsAndColumns(int[][] array) {
        int[][] newArray = Arrays.copyOf(array, array.length);
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                n = newArray[i][j];
                newArray[i][j] = newArray[j][i];
                newArray[j][i] = n;
            }
        }
        return newArray;
    }
}

