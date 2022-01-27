package ua.bakhtyzina.hw4;

import java.sql.Array;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = generateArray();
        System.out.println(Arrays.toString(numbers));
        averageValue(numbers);
    }
    private static int[] generateArray() {
        int[] array = new int[400];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 10);
        }
        return array;
    }

    private static void averageValue(int[] numbers) {
        int[] array = Arrays.copyOf(numbers, numbers.length);
        double ar = 0;
        double geom = 1.0;
        for (int i = 0; i < array.length; i++) {
            ar += array[i];
            geom *= array[i];
        }
        System.out.println("Arithmetic mean = " + ar / numbers.length);
        System.out.println("Geometric mean = " + Math.pow(geom, 1 / numbers.length));
    }

}
