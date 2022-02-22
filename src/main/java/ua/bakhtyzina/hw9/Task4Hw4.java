package ua.bakhtyzina.hw9;

import java.util.Arrays;

public class Task4Hw4 {

    public  int[] generateArray() {
        int[] array = new int[2000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 4000 - 2000);
        }
        return array;
    }

    public int[] changeEvenToZero(int[] numbers) {
        int[] array = Arrays.copyOf(numbers, numbers.length);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
        return array;
    }
}


