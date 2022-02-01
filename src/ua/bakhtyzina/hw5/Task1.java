package ua.bakhtyzina.hw5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[][] array = new int[6][5];
        indexValueArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    private static void indexValueArray(int[][] array) {
        int n = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0) {
                    array[i][j] = n;
                } else {
                    array[i][j] = -1 * n;
                }
                n++;
            }
        }
    }
}