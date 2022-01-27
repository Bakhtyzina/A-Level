package ua.bakhtyzina.hw4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = generateArray();
        int[] changeNumber = changeArrayForZero(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("New Array = " + Arrays.toString(changeNumber));
    }

    private static int[] generateArray() {
        int[] array = new int[2000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 4000 - 2000);
        }
        return array;
    }

    private static int[] changeArrayForZero(int[] number) {
        int[] array = Arrays.copyOf(number, number.length);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
        return array;
    }
}

